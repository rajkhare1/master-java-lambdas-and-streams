package com.rajkhare.functionaljava;

import java.time.LocalDateTime;
import java.util.function.UnaryOperator;

public class LambdaComposability {

    public static void operationLogger(UnaryOperator<Integer> increment) {
        System.out.println("Start: " + LocalDateTime.now());
        increment.apply(10);
        System.out.println("End: " + LocalDateTime.now());
    }

    public static void main(String[] args) {
        UnaryOperator<Integer> increment = x -> x + 1;

        LambdaComposability.operationLogger(increment);

    }

}
