package primitivespackage;

class ConversionsDemo {
    static void narrowDemo() {
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
    }
}
