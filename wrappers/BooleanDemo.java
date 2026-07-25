package wrapperspackage;

class BooleanDemo {
    static void instantiateDemo() {
        // Ways to instantiate Boolean

        // new Boolean(String s)
        // if s is null, then the result is false
        Boolean b1 = new Boolean(null);
        System.out.println("b1 = " + b1);

        // if s is "true" or "True" or "TRUE" or any combination of upper and 
        // lower case letters that spells "true", then the result is true
        // because it calls equalsIgnoreCase() method of String class
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("True");
        Boolean b4 = new Boolean("TRUE");
        Boolean b5 = new Boolean(" tRuE   ");
        Boolean b6 = new Boolean("any other string");
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);
        System.out.println("b5 = " + b5);
        System.out.println("b6 = " + b6);

        // new Boolean(boolean b)
        Boolean b7 = new Boolean(true);
        Boolean b8 = new Boolean(false);
        // Boolean b9 = new Boolean(1); // compile error: incompatible types: int cannot be converted to boolean
        System.out.println("b7 = " + b7);
        System.out.println("b8 = " + b8);

        // Boolean.valueOf(String s)
        // it returns a Boolean object, not a primitive boolean value
        // returns the Boolean static object TRUE or FALSE
        // the only difference with new Boolean(String s) is that it does not create a new object
        // but returns the existing static object
        Boolean b9 = Boolean.valueOf("true"); 
        System.out.println("b9 = " + b9);

        Boolean b10 = Boolean.valueOf("TrUe");
        System.out.println("b10 = " + b10);

        System.out.println("b9 == b10: " + (b9 == b10)); // true, because both are the same static object
        System.out.println("b2 == b3: " + (b2 == b3)); // false, because both are different objects
        System.out.println("b2 == b9: " + (b2 == b9)); // false, because both are different objects

        Boolean b11 = Boolean.valueOf("true   ");
        System.out.println("b11 = " + b11);

        Boolean b12 = Boolean.valueOf("any other string");
        System.out.println("b12 = " + b12);
    }

    static void equalityDemo() {
        Boolean b1 = true; // auto-boxing, but b1 points to a static Boolean object, not a new object
        Boolean b2 = new Boolean(true); // b2 points to a new Boolean object
        boolean b3 = true;
        Boolean b4 = true;

        System.out.println("b1.equals(b2): " + b1.equals(b2)); // true, because b2 is auto-boxed to Boolean object
        System.out.println("b1.equals(b3): " + b1.equals(b3)); // true, because b3 is auto-boxed to Boolean object
        System.out.println("b1 == b2: " + (b1 == b2)); // false, because b2 is a new object and == compares references
        System.out.println("b1 == b3: " + (b1 == b3)); // true, the wrapper is unboxed to primitive boolean for comparison
        System.out.println("b1 == b4: " + (b1 == b4)); // true, because both are the same static object
    }

    static void methodsDemo() {
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(false);
        boolean b3 = true;

        System.out.println("b1.booleanValue() = " + b1.booleanValue()); // returns the primitive boolean value of the Boolean object
        System.out.println("b2.booleanValue() = " + b2.booleanValue()); // returns the primitive boolean value of the Boolean object

        System.out.println("b1.toString() = " + b1.toString()); // returns the String representation of the Boolean object

        System.out.println("b1.compareTo(b2) = " + b1.compareTo(b2)); // returns the result of comparing the two Boolean objects
        System.out.println("b2.compareTo(b1) = " + b2.compareTo(b1)); // returns the result of comparing the two Boolean objects
        System.out.println("b1.compareTo(b3) = " + b1.compareTo(b3)); // returns the result of comparing the Boolean object with a primitive boolean value
        // System.out.println("b3.compareTo(b1) = " + b3.compareTo(b1)); // compile error: cannot use method to a primitive boolean value
    }
}
