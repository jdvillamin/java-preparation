#!/usr/bin/env bash

set -euo pipefail

usage() {
    echo "Usage: $0 <package> [args...]" >&2
}

if (( $# < 1 )); then
    usage
    exit 1
fi

package_name=$1
shift

if [[ ! $package_name =~ ^[A-Za-z_][A-Za-z0-9_]*(\.[A-Za-z_][A-Za-z0-9_]*)*$ ]]; then
    echo "Invalid package name: $package_name" >&2
    usage
    exit 1
fi

package_dir=${package_name//.//}
main_source="$package_dir/Main.java"
build_root=".build"
build_dir=".build/classes"

cleanup() {
    rm -rf -- "$build_root"
}
trap cleanup EXIT

if [[ ! -d $package_dir ]]; then
    echo "Package directory not found: $package_dir" >&2
    exit 1
fi

if [[ ! -f $main_source ]]; then
    echo "Main.java not found in package directory: $package_dir" >&2
    exit 1
fi

rm -rf -- "$build_root"
mkdir -p -- "$build_dir"

mapfile -d '' sources < <(find "$package_dir" -type f -name '*.java' -print0 | sort -z)

if (( ${#sources[@]} == 0 )); then
    echo "No Java source files found under: $package_dir" >&2
    exit 1
fi

javac -d "$build_dir" "${sources[@]}"
java -cp "$build_dir" "$package_name.Main" "$@"
