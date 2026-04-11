package streams;

import java.util.List;
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

        System.out.println("-------------------------------------------");

        numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.limit(2).filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("-------------------------------------------");

        Stream<String> names = Stream.of("apple", "banana", "mango", "strawberry");
        List<String> namesProcessed = names
                .map(String::toUpperCase)
                .peek(str -> System.out.println("Peek result: " + str))
                .filter(name -> name.length() < 6)
//                .forEach(System.out::println);
                .toList();
        System.out.println(namesProcessed);

        System.out.println("-------------------------------------------");

        numbers = Stream.of(1, 2, 9, 8, 3, 6, 4, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("-------------------------------------------");

        Stream<Integer> oddNumbers = Stream.of(1, 3, 5, 7, 9);
        Stream<Integer> evenNumbers = Stream.of(0, 2 , 4, 6, 8);
        Stream.concat(evenNumbers, oddNumbers).forEach(System.out::println);

        Stream<Student> studentStream = Stream.of(
                new Student(1, "Foo"),
                new Student(2, "Bar"),
                new Student(3, "A")

                );

        System.out.println("-------------------------------------------");

        List<String> studentNames = studentStream.filter(s -> s.getName().length() > 2)
                .map(s -> s.getName())
                .toList();

        System.out.println("studentNames = "+studentNames);


    }

}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
