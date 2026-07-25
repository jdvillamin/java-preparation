package fieldspackage;

class Parent {
    int x = 5;
}

class Child extends Parent {
    // shadowing occurs (or hiding) even if types are different
    long x = 10;
}

public class FieldInheritanceDemo {
    private int y = 0;
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent pc = new Child();
        Child c = new Child();

        System.out.println(p.x);
        System.out.println(pc.x);
        System.out.println(c.x);

        FieldInheritanceDemo f = new FieldInheritanceDemo();
        System.out.println(f.y);
    }    
}
