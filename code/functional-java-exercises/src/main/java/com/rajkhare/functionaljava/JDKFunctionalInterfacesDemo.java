package com.rajkhare.functionaljava;

import java.util.function.*;

public class JDKFunctionalInterfacesDemo {

    public static void main(String[] args) {


//        Function<Integer, Integer> f1 = x -> x * 2;
        UnaryOperator<Integer> f1 = x -> x * 2;
        f1.apply(10);

        Function<Integer, String> f2 = num -> "Value is " + num;

        Consumer<String> f3 = name -> System.out.println("Hello " + name);
        f3.accept("Raj");

        Supplier<Double> f4 = () -> Math.random();
        f4.get();

        Predicate<Integer> f5 = num -> (num % 2) == 0;
        f5.test(10);
//         Function<Integer, Boolean> f5 = num -> (num % 2) == 0;


    }

}
