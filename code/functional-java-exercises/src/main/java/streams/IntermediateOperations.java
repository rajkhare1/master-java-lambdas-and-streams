package streams;

import java.util.stream.Stream;

public class IntermediateOperations {

    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> limitedStream = numbers.limit(5);
        limitedStream.forEach(System.out::println);

        System.out.println("-------------------------------------------");

        //take new stream again because it's done
        numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> evenStream = numbers.filter(num -> num % 2 == 0);
        Stream<Integer> first2evens = evenStream.limit(2);
        first2evens.forEach(System.out::println);

    }

}
