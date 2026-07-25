package lambdaexpressions;

import java.util.function.Predicate;

interface MathOperation {
    int operation(int a, int b);
}

class LambdaDemo {
    Integer i = 5;
    static Integer j = 5;

    static void lambdaDemo() {
        // valid syntax for a lambda expression
        int two = 2; // must be effectively final to be used in the lambda expression
        Predicate<Integer> isEven = (Integer i) -> i % two == 0;
        System.out.println("Is 5 even? " + isEven.test(5));

        // Predicate<Integer> isOdd = (i) -> i % ++two != 0; // cannot modify two here because it is used in the previous lambda expression

        // parameter shadowing doesn't occur, it doesn't create a new variable scope
        // Integer x = 5;
        // Predicate<Integer> isGreaterThanX = (Integer x) -> x > 10;

        Predicate<Integer> isGreaterThanI = (i) -> i * ++j > 10; // this is valid because it doesn't shadow the instance variable i
        System.out.println(isGreaterThanI.test(15));

        Predicate<Integer> combinedPredicate = isEven.negate().and(isGreaterThanI);
        System.out.println("Is 15 even and greater than 5? " + combinedPredicate.test(16));

        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;

        System.out.println("5 + 3 = " + addition.operation(5, 3));
        System.out.println("5 - 3 = " + subtraction.operation(5, 3));
    }
}
