package wrappers;

class FloatDemo {
    static void creationDemo() {
        // Ways to initialize Float

        // Float(float f)
        // Float(double d)
        // Float(String s) // can be "<double>" or "<float>" or "<int>" or "<long>"
        Float f1 = new Float(10.5f);
        Float f2 = new Float(10.5);
        Float f3 = new Float("10.5");
        Float f4 = new Float("10.5f");
        Float f5 = new Float("10.5d");
        Float f6 = new Float("10");

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
        System.out.println("f5 = " + f5);
        System.out.println("f6 = " + f6);

        // Float.valueOf(float f)
        // Float.valueOf(String s) // can be "<double>" or "<float>" or "<int>" or "<long>"
        Float f7 = Float.valueOf(10.5f);
        Float f9 = Float.valueOf("10.5");
        Float f10 = Float.valueOf("10.5f");
        Float f11 = Float.valueOf("10.5d");
        Float f12 = Float.valueOf("10");
        
        System.out.println("f7 = " + f7);
        System.out.println("f9 = " + f9);
        System.out.println("f10 = " + f10);
        System.out.println("f11 = " + f11);
        System.out.println("f12 = " + f12);

        // Float.parseFloat(String s) // can be "<double>" or "<float>" or "<int>" or "<long>"
        float f13 = Float.parseFloat("10.5");
        float f14 = Float.parseFloat("10.5f");
        float f15 = Float.parseFloat("10.5d");
        float f16 = Float.parseFloat("10");

        // Autoboxing
        Float f17 = Float.parseFloat("10.5");
        Float f18 = Float.parseFloat("10.5f");
        Float f19 = Float.parseFloat("10.5d");
        Float f20 = Float.parseFloat("10");

        System.out.println("f13 = " + f13);
        System.out.println("f14 = " + f14);
        System.out.println("f15 = " + f15);
        System.out.println("f16 = " + f16);

        System.out.println("f17 = " + f17);
        System.out.println("f18 = " + f18);
        System.out.println("f19 = " + f19);
        System.out.println("f20 = " + f20);
    }
}
