package com.example.Java8Demo.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamExamples {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++) myList.add(i);
//        myList.stream().filter(p -> p>20).forEach(System.out::println);

        Stream<String> names = Stream.of("aBc", "d", "ef");
//        names.map(s -> s.toUpperCase()).forEach(System.out::println);


        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
        List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(reverseSorted);

        Stream<String> names3 = Stream.of("aBc", "d", "ef", "123456");
//        names3.sorted().toList().forEach(System.out::println);

       List<List<String>> namesOriginalList = List.of(List.of("Hello1", "Raj1", "Bhuva1"),List.of("Hello2", "Raj2", "Bhuva2"),List.of("Hello3", "Raj3", "Bhuva3"));
        List<String> collect = namesOriginalList.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
        collect.forEach(System.out::println);


        Stream<Integer> numbers = Stream.of(1,2,3,4,5);

        Optional<Integer> intOptional = numbers.reduce((i, j) -> i*j);
        intOptional.ifPresent(integer -> System.out.println("Mul = " + integer));
        System.out.println(intOptional.stream().count());

        Stream<String> names4 = Stream.of("Raj","Bhuva","Rajjj", "Kamal");
        Optional<String> optionalS = names4.filter(i -> i.startsWith("R")).findFirst();
        optionalS.ifPresent(s -> System.out.println("First Name starting with D =" + s));

    }
}
