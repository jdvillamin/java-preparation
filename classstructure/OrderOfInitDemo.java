package classstructurepackage;

class OrderOfInitDemo {
    static int x = print();
    
    static {
        System.out.println("Static block executed.");
        x = 10;
    }

    static int y = print();

    static int print() {
        System.out.println("Print method executed.");
        OrderOfInitDemo obj = new OrderOfInitDemo();
        System.out.println("Printed object: " + obj);
        return 5;
    }

    {
        System.out.println("Instance block executed.");
    }
   
    OrderOfInitDemo() {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
    }
}
