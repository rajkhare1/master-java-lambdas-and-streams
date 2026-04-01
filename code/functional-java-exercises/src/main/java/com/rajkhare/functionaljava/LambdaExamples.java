package com.rajkhare.functionaljava;

public class LambdaExamples {

    public static void main(String[] args) {

       MathOperation increment = x -> x + 1;
       int result = increment.operation(10);
        System.out.println("result = " + result);

        MathOperation newLambda = num -> num * 2 + 126;
//        AnotherOperation newLambda = num -> num * 2 + 126;
        System.out.println(newLambda);

        newLambda = increment;// will not work if different interface, does not depend on SAM signature
        System.out.println(newLambda.operation(20));

    }

}

interface MathOperation {
    int operation(int x);
}

interface AnotherOperation {
    int operation(int x);
}