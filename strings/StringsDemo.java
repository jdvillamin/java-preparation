package strings;

class StringsDemo {
    static void creationDemo() {
        // Constructors
        String s0 = new String();
        String s1 = new String("Hello");
        String s2 = new String(new char[] {'H', 'e', 'l', 'l', 'o'});
        String s3 = new String(new char[] {'H', 'e', 'l', 'l', 'o'}, 1, 3);
        String s4 = new String(new StringBuilder());

        System.out.println("s0: " + s0);
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("s4: " + s4);

        // String utility
        String b = String.valueOf(true);
        String c = String.valueOf('A');
        String i = String.valueOf(123);
        String l = String.valueOf(123L);

        String f = String.valueOf(123.45f);
        String d = String.valueOf(123.45d);

        String ch = String.valueOf(new char[] {'H', 'e', 'l', 'l', 'o'});
        String sb = String.valueOf(new StringBuilder("Hello"));
        String obj = String.valueOf(new Object());

        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("i: " + i);
        System.out.println("l: " + l);
        System.out.println("f: " + f);
        System.out.println("d: " + d);
        System.out.println("ch: " + ch);
        System.out.println("sb: " + sb);
        System.out.println("obj: " + obj);

        // join method
        String joined = String.join(", ", "Hello", "World", "!");
        System.out.println("Joined: " + joined);
    }

    static void inspectionMethodsDemo() {
        String s0 = "Hello, World!";
        String s1 = "";

        // length()
        System.out.println("Length: " + s0.length());
        System.out.println("Length of empty string: " + s1.length());
        
        // isEmpty()
        System.out.println("Is empty: " + s1.isEmpty());
        
        // REMEMBER: throws StringIndexOutOfBoundsException if index is out of bounds
        // charAt(int index)
        System.out.println("Char at index 1: " + s0.charAt(1));
        // System.out.println("Char at index .length(): " + s0.charAt(s0.length())); // throws StringIndexOutOfBoundsException
        // System.out.println("Char at index -1: " + s0.charAt(-1)); // throws StringIndexOutOfBoundsException
        // System.out.println("Char at index 1L: " + s0.charAt(1L)); // charAt(int i) is the signature, so explicit casting is needed
    }

    static void searchingMethodsDemo() {
        String s0 = "Hello, World!";
        
        // REMEMBER: 
        // - can take either a char or a String as an argument
        // - returns -1 if not found
        // indexOf(char c)
        // indexOf(char c, int fromIndex)
        // indexOf(String s)
        // indexOf(string s, int fromIndex)
        System.out.println("Index of 'o': " + s0.indexOf('o'));
        System.out.println("Index of 'o' after index 5: " + s0.indexOf('o', 5));
        System.out.println("Index of 'World': " + s0.indexOf("World"));
        System.out.println("Index of 'World' after index 10: " + s0.indexOf("World", 10));

        // REMEMBER: 
        // - can take either a char or a String as an argument
        // - returns -1 if not found
        // lastIndexOf(char c)
        // lastIndexOf(char c, int fromIndex)
        // lastIndexOf(String s)
        // lastIndexOf(String s, int fromIndex)
        System.out.println("Last index of 'o': " + s0.lastIndexOf('o'));
        System.out.println("Last index of 'o' before index 4: " + s0.lastIndexOf('o', 4));
        System.out.println("Last index of 'World': " + s0.lastIndexOf("World"));
        System.out.println("Last index of 'World' before index 10: " + s0.lastIndexOf("World", 6));

        // REMEMBER: only takes a String as an argument, not a char
        // startsWith(String prefix)
        // startsWith(String prefix, int toffset)
        // endsWith(String suffix)
        System.out.println("Starts with 'Hello': " + s0.startsWith("Hello"));
        System.out.println("Starts with 'World' at index 7: " + s0.startsWith("World", 7));
        System.out.println("Ends with 'World!': " + s0.endsWith("World!"));

        // contains(CharSequence s)
        System.out.println("Contains 'Hello': " + s0.contains("Hello"));
    }

    static void manipulationMethods() {
        // REMEMBER: Strings are immutable, so all methods return a new String object!!!
        String s0 = "Hello, World!";

        // REMEMBER: methods or non-tolerant and will throw exceptions if the arguments are invalid
        // substring(int beginIndex)
        // substring(int beginIndex, int endIndex)
        System.out.println("Substring from index 7: " + s0.substring(7));
        System.out.println("Substring from index 7 to 12: " + s0.substring(7, 12));
        // System.out.println("Substring from index 7 to 20: " + s0.substring(7, 20)); // throws StringIndexOutOfBoundsException
        // System.out.println("Substring from index 7 to 5: " + s0.substring(7, 5)); // throws StringIndexOutOfBoundsException
        System.out.println("Substring from index 7 to 7 emptiness: " + s0.substring(7, 7).isEmpty()); // returns an empty string

        // concat(String str)
        System.out.println("Concatenation: " + s0.concat(" How are you?"));

        // Using + operators with literals resolves the String at compile time, so the result is a String literal
        String s1 = "Hello, " + "World!";
        System.out.println("s0 == s1: " + (s0 == s1)); // true

        // Concatenation with null
        String s2 = "Hello, " + null;
        System.out.println("s2: " + s2); // "Hello, null"

        // String s3 = "Hello, ".concat(null); // throws NullPointerException
        // String x = null;
        // String s4 = x.concat("Hello, "); // throws NullPointerException
        // System.out.println("s3: " + s3);
        // System.out.println("s4: " + s4);

        // REMEMBER: Strings are immutable, you need to assign to a variable to take effect!
        // replace(char oldChar, char newChar)
        // replace(CharSequence target, CharSequence replacement)
        // replaceAll(String regex, String replacement)
        System.out.println("Replace 'o' with '0': " + s0.replace('o', '0'));
        System.out.println("Replace 'World' with 'Java': " + s0.replace("World", "Java"));
        System.out.println("Replace all 'l' with 'L': " + s0.replaceAll("l", "L"));

        // trim()
        // toLowerCase()
        // toUpperCase()
        String s3 = "   Hello, World!   ";
        System.out.println("Trimmed: '" + s3.trim() + "'");
        System.out.println("Lowercase: '" + s3.toLowerCase() + "'");
        System.out.println("Uppercase: '" + s3.toUpperCase() + "'");
    }

    static void equalityDemo() {
        String s0 = "Hello, World!";
        String s1 = "Hello, World!";
        String s2 = new String("Hello, World!");
        String s3 = "Hello, " + "World!"; // compile-time concatenation, interned
        String w = "World!";
        String s4 = "Hello, " + w; // run-time concatenation, not interned

        System.out.println("s0 == s1: " + (s0 == s1)); // true
        System.out.println("s0 == s2: " + (s0 == s2)); // false
        System.out.println("s0 == s3: " + (s0 == s3)); // true
        System.out.println("s0 == s4: " + (s0 == s4)); // false
        System.out.println("s0.equals(s1): " + s0.equals(s1)); // true
        System.out.println("s0.equals(s2): " + s0.equals(s2)); // true
        // manually intern s2
        s2 = s2.intern();
        System.out.println("s0 == s2 after interning: " + (s0 == s2)); // true

        // equalsIgnoreCase(String anotherString)
        String s5 = "hello, world!";
        System.out.println("s0.equalsIgnoreCase(s5): " + s0.equalsIgnoreCase(s5)); // true
    }
}
