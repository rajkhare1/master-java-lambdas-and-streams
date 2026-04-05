package com.rajkhare.functionaljava;

import java.time.LocalDateTime;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class LambdaComposability {

    public static void operationLogger(UnaryOperator<Integer> operator) {
        System.out.println("Start: " + LocalDateTime.now());
        operator.apply(10);
        System.out.println("End: " + LocalDateTime.now());
    }


    public static void main(String[] args) {

        Consumer<String> logMsgWithTimestamp = msg -> System.out.println(msg+": " + LocalDateTime.now());
        Runnable logStart = () -> logMsgWithTimestamp.accept("Start");
        Runnable logEnd = () -> logMsgWithTimestamp.accept("End");

        BiConsumer<UnaryOperator<Integer>, Integer> logger = (operation, number) -> {
            logStart.run();
            operation.apply(number);
            logEnd.run();

        };

        logger.accept(x -> x + 1, 20);
        logger.accept(x -> x * 100, 42);
    }

}
