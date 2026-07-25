package printpackage;

class Example {
    public String toString() {
        return "I have overridden the toString() method.";
    }
}

class Example2 {}

public class PrintDemo {
    static void printDemo() {
        System.out.println("Hello, World!");

        Example example = new Example();
        System.out.println(example);

        Example2 example2 = new Example2();
        System.out.println(example2);
    }
}
