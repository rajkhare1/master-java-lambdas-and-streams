package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) throws IOException {

        // Using the stream() API
        Set<String> names = Set.of("Foo", "Bar", "Baz");
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);

        // Using an Array
        int[] numbers = {1, 2, 3, 4, 5};
        Arrays.stream(numbers).forEach(System.out::println);

        // Using Stream.of
        Stream.of("mango", "banana", "strawberry").forEach(System.out::println);

        // Using built in APIs that return Stream
        Stream<String> lines = Files.lines(Paths.get("README.md"));
        lines.forEach(System.out::println);

        // Using Stream.generate() : infinite Stream
        Stream.generate(new Random()::nextDouble)
                .limit(10)
                .forEach(System.out::println);

        // Using Stream.iterate(seed, UnaryOperator) : infinite Stream
        Stream.iterate(0, x -> x + 2)
                .limit(10)
                .forEach(System.out::println);
        
        // Create collection from the Stream: toList()
        List<Integer> upToHundred = Stream.iterate(0, x -> x + 1)
                .limit(100)
                .toList();
        System.out.println(upToHundred);


    }

}
