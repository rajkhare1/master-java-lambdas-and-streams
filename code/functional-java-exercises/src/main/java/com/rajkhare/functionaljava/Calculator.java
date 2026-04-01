package com.rajkhare.functionaljava;

public class Calculator {

    public static int doMathOperation(IntOperation op, int a, int b) {
        return op.doOperation(a, b);
    }

    public static void main(String[] args) {
        IntOperation addition = (x ,y) -> x + y;
        IntOperation subtraction  =  (x, y) -> x - y;

        int resultAddition = doMathOperation(addition, 10, 20);
        System.out.println("Addition : "+ resultAddition);
        int resultSubtraction = doMathOperation(subtraction, 30, 20);
        System.out.println("SubTraction :" + resultSubtraction);

    }

}

@FunctionalInterface
interface IntOperation {
    int doOperation(int i, int j);
}
