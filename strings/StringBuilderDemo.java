package strings;

class StringBuilderDemo {
    static void creationDemo() {
        // length and capacity are properties of StringBuilder
        StringBuilder sb1 = new StringBuilder();
        System.out.println("Length: " + sb1.length());
        System.out.println("Capacity: " + sb1.capacity());

        sb1.append("Hello");
        System.out.println("Length: " + sb1.length());
        System.out.println("Capacity: " + sb1.capacity());

        sb1.append(" World");
        System.out.println("Length: " + sb1.length());
        System.out.println("Capacity: " + sb1.capacity());

        StringBuilder sb2 = new StringBuilder(50);
        System.out.println("Length: " + sb2.length());
        System.out.println("Capacity: " + sb2.capacity());

        // capacity = 16 + initial string length
        StringBuilder sb3 = new StringBuilder("Hello World");
        System.out.println("Length: " + sb3.length());
        System.out.println("Capacity: " + sb3.capacity());

        // capacity = 2 * old capacity + 2
        sb3.append(" This is a long string that will exceed the initial capacity.");
        System.out.println("Length: " + sb3.length());
        System.out.println("Capacity: " + sb3.capacity());
    }

    static void methodsDemo() {
        StringBuilder sb1 = new StringBuilder("Hello World");
        StringBuilder sb2 = new StringBuilder("Hello World");
        StringBuilder sb3 = new StringBuilder("Hello World");
        StringBuilder sb4 = new StringBuilder("Hello World");
        StringBuilder sb5 = new StringBuilder("Hello World");
        StringBuilder sb6 = new StringBuilder("Hello World");

        // append(...)
        // append(..., int start, int end)
        // append(char[] str, int offset, int len)
        System.out.println(sb1.append("!"));
        System.out.println(sb1.append(" How are you?", 5, 7));
        System.out.println(sb1.append(new char[]{'H', 'e', 'l', 'l', 'o'}, 1, 3));

        // insert(int offset, ...)
        // insert(int offset, ..., int start, int end)
        // insert(int offset, char[] str, int offset, int len)
        System.out.println(sb2.insert(5, ","));
        System.out.println(sb2.insert(5, " How are you?", 5, 7));
        System.out.println(sb2.insert(5, new char[]{'H', 'e', 'l', 'l', 'o'}, 1, 3));

        // REMEMBER: end index is handled gracefully, but start index must be valid
        // delete(int start, int end)
        // deleteCharAt(int index)
        System.out.println(sb3.delete(5, 6));
        System.out.println(sb3.deleteCharAt(5));
        System.out.println(sb3.delete(5, 100)); // end index is handled gracefully
        // System.out.println(sb3.delete(100, 200)); // throws StringIndexOutOfBoundsException

        // REMEMBER: 
        // - end index is handled gracefully, but start index must be valid
        // - this is different from String's replace(old, new) method, which replaces all occurrences of old with new
        // - StringBuilder's replace(start, end, str) method replaces the substring from start to end with str
        // - StringBuilder doesn't have replace(int start, int end, String str, int start, int end) method
        // replace(int start, int end, String str)
        System.out.println(sb4.replace(5, 6, ","));
        System.out.println(sb4.replace(5, 100, "!")); // end index is handled gracefully
        // System.out.println(sb4.replace(100, 200, "!")); // throws StringIndexOutOfBoundsException

        // reverse()
        System.out.println(sb5.reverse());

        // REMEMBER: 
        // - setLength() can be used to truncate or extend the StringBuilder
        sb6.setLength(5);
        System.out.println(sb6);
        System.out.println("Length: " + sb6.length());
        System.out.println("Capacity: " + sb6.capacity());

        sb6.setLength(20);
        System.out.println(sb6.toString().replace('\u0000', '-'));
        System.out.println("Length: " + sb6.length());
        System.out.println("Capacity: " + sb6.capacity());

        // REMEMBER: substring is the only method from String that isn't mutating
        // substring(int start)
        // substring(int start, int end)
        System.out.println(sb1.substring(6));
        System.out.println(sb1.substring(6, 11));

        // methods from String that are also in StringBuilder
        // charAt(int index)
        // indexOf(String str)
        // indexOf(String str, int fromIndex)
        // lastIndexOf(String str)
        // lastIndexOf(String str, int fromIndex)

        System.out.println(sb1.charAt(6));
        System.out.println(sb1.indexOf("World"));
        System.out.println(sb1.indexOf("World", 7));
        System.out.println(sb1.lastIndexOf("World"));
        System.out.println(sb1.lastIndexOf("World", 10));

    }
}
