package operatorspackage;

class Parent {}

class Child extends Parent {}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();

        // boolean b = c instanceof Parent;
        boolean b = c instanceof Object;

        System.out.println(b);
        
        int i = 0;
        int x = -++i;
        System.out.println(x);
    }
}
