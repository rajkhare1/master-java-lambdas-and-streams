package com.rajkhare.functionaljava;

import java.util.function.Function;

public class ScopeProblem {

    public static Function<Integer, Integer> counter() {
        int count = 0;
        Function<Integer, Integer> increment = x -> count + 1;
//        count = count + 1;
        return increment;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> counter = ScopeProblem.counter();
        System.out.println(counter.apply(0));
    }

}
