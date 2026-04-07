package streams;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {

        // Using the stream() API
        Set<String> names = Set.of("Foo", "Bar", "Baz");
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);

        // Using an Array
        int[] numbers = {1, 2, 3, 4, 5};
        Arrays.stream(numbers).forEach(System.out::println);

        // Using Stream.of
        Stream.of("mango", "banana", "strawberry").forEach(System.out::println);
    }

}
