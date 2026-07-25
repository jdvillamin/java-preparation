package primitivespackage;

class ConversionsDemo {
    static void conversionDemo() {
        // Concept 1:
        // byte -> short -> int -> long -> float -> double (implicit / widening / auto)
        // char -> int -> long -> float -> double
        
        // double -> float -> long -> int -> short -> byte (explicit / narrowing)

        // Concept 2:
        // int to smaller integer types and char type is possible implicitly given that:
        // 1. the int to be assigned is a literal or a constant (final)
        // 2. the int to be assigned falls in the range of the smaller type

        byte b1 = 100;
        // byte b2 = 200; // compile error, because byte is only from -128 to 127

        System.out.println("b1 = " + b1);

        final int x = 50;
        byte b3 = x;

        System.out.println("b3 = " + b3);

        // int y = 50;
        // byte b4 = y; // compile error, y is not a constant

        // char c1 = -1; // compile error, char is from 0 to 2^16 - 1

        // Concept 3:
        // explicit casting larger integers to smaller types would result to wrapping
        char c2 = (char) -1;

        System.out.println((int) c2); // wraps around: -1 -> 2^16 - 1

        // Concept 4:
        // auto conversion between short and char doesn't work because short is from -2^16 to 2^16 - 1
        // while char is from 0 to 2^16 - 1
        short s1 = -1;
        // char c = s; // compile error
        char c3 = (char) s1;

        System.out.println("c3 = " + (int) c3);

        char c4 = 'A';
        // short s2 = c4; // compile error
        short s2 = (short) c4;

        System.out.println("s2 = " + (int) s2);

        // Concept 5:
        // an int that is too large (larger than 2^31 - 1) cannot be a literal
        // long l1 = 2147483648; // too large
        // however, adding to a larger would wrap
        long l1 = 2147483647 + 1; // even if it will be resolved at compile time, wrapping will occur
        System.out.println("l1 = " + l1);

        long l2 = 2147483648L; // should append l/L or cast
        // long l3 = (long) 2147483648; // cast doesn't solve the problem because literal is still invalid
        System.out.println("l2 = " + l2);
    }
}
