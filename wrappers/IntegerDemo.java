package wrappers;

class IntegerDemo {
    static void instantiateDemo() {
        // Ways to instantiate Integer

        // new Integer(String s)
        // if s is null, then it throws NumberFormatException
        // Integer i1 = new Integer(null); // throws NumberFormatException
        Integer i2 = new Integer("123");
        System.out.println("i2 = " + i2);

        // new Integer(int i)
        Integer i3 = new Integer(456);
        System.out.println("i3 = " + i3);

        // Integer.valueOf(String s)
        // it returns an Integer object, not a primitive int value
        // returns the Integer static object for values between -128 and 127
        // the only difference with new Integer(String s) is that it does not create a new object
        // but returns the existing static object for values between -128 and 127
        Integer i4 = Integer.valueOf("123"); 
        System.out.println("i4 = " + i4);

        Integer i5 = Integer.valueOf("456");
        System.out.println("i5 = " + i5);

        System.out.println("i4 == i5: " + (i4 == i5)); // false, because both are different objects

        Integer i6 = Integer.valueOf("123");
        System.out.println("i6 = " + i6);
        System.out.println("i4 == i6: " + (i4 == i6)); // true, because both are the same static object for values between -128 and 127
    }

    static void parseAndDecodeDemo() {
        byte b1 = Byte.parseByte("127");
        byte b2 = Byte.parseByte("12", 16);
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        byte b3 = Byte.decode("027"); // 27 is interpreted as octal, so it is 23 in decimal
        System.out.println("b3 = " + b3);

        int i1 = Integer.parseInt("014");
        int i2 = Integer.parseInt("014", 8);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        int i3 = Integer.decode("014");
        System.out.println("i3 = " + i3); // 12, because it is interpreted as octal

        long l1 = Long.parseLong("014");
        long l2 = Long.parseLong("014", 5);
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        long l3 = Long.decode("014");
        System.out.println("l3 = " + l3); // 12, because it is interpreted as octal
    }

    static void equalityDemo() {
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = Integer.parseInt("100");
        Integer i4 = Integer.valueOf("100");
        Integer i5 = Integer.valueOf(100);
        Integer i6 = new Integer(100);

        System.out.println(i1 == i2); // true, because both are the same static object for values between -128 and 127
        System.out.println(i1 == i3); // true, because both are the same static
        System.out.println(i1 == i4); // true, because both are the same static
        System.out.println(i1 == i5); // true, because both are the same static
        System.out.println(i1 == i6); // false, because i6 is a new
        System.out.println(i1.equals(i6)); // true, because equals() compares the values of the Integer objects
    }

    static void differentTypeDemo() {
        Integer i1 = 128;
        Long l1 = 128L;
        int i2 = 128;
        long l2 = 128L;
        Integer i3 = 128;

        // Remember, == must evaluate two compatible types
        // System.out.println(new String() == new StringBuilder()); // comppile error, incompatible types
        // System.out.println(i1 == l1); // compile error, incompatible types
        
        System.out.println(i1 == i2); // true, because i1 is unboxed to int for comparison
        System.out.println(l1 == l2); // true, because l1 is unboxed
        System.out.println(i1 == i3); // false, because 128 is outside the range of -128 to 127, so i1 and i3 are different objects
        System.out.println(i1.equals(i3)); // true, because equals() compares the values of the Integer objects
        System.out.println(i1.equals(l1)); // false, because equals() compares the types of the objects, and i1 is an Integer and l1 is a Long
        System.out.println(l1.equals(i1)); // false, because equals() compares the types of the objects, and l1 is a Long and i1 is an Integer

        Integer i4 = 127;
        Integer i5 = Integer.parseInt("127");
        Integer i6 = Integer.valueOf("127");
        int i7 = Integer.parseInt("0127");
        int i8 = Integer.decode("127");

        System.out.println(i4 == i5); // true, because both are the same static object for values between -128 and 127
        System.out.println(i4 == i6); // true, because both are the same static object for values between -128 and 127
        System.out.println(i4 == i7); // true, because i4 is unboxed to int for comparison
        System.out.println(i4 == i8); // true, because i4 is unboxed to int for comparison
    }

    static void cachingDemo() {
        // REMEMBER: valueOf and parseInt will both cache because valueOf will cache and parseInt will return a primitive
        Integer i1 = 100;
        Integer i2 = Integer.valueOf(100);
        Integer i3 = Integer.parseInt("100");
        Integer i4 = new Integer(100);

        System.out.println(i1 == i2); // true, because both are the same static object for values between -128 and 127
        System.out.println(i1 == i3); // true, because both are the same static
        System.out.println(i1 == i4); // false, because i4 is a new

        System.out.println(i1.equals(i4)); // true, because equals() compares the values of the Integer objects
    }
}
