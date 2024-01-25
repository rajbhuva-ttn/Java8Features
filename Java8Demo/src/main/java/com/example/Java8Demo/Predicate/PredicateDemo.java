package com.example.Java8Demo.Predicate;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Function;
import java.util.function.Predicate;

@Slf4j
public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> predicate = a->a==5;
        log.info(String.valueOf(predicate.test(6)));
        log.info(String.valueOf(predicate.test(5)));

        Predicate<Integer> p1 = a->a>5;
        Predicate<Integer> p2 = a->a<=6;
        PredicateDemo p = new PredicateDemo();
        p.printNumbers(p1.negate(),10);
//        p.printNumbers(p1.and(p2),10);
//        p.printNumbers(p1.or(p2),10);

        //Function Demo
        Function<String,Integer> f = s->s.length();  // with lambda
        Function<String,Integer> f1 = String::length; // with Method reference

        log.info(String.valueOf(f.apply("Hellow Functions")));
        log.info(String.valueOf(f1.apply("Hellow Functions")));
    }

    public void printNumbers(Predicate<Integer> p, int number){
        log.info("Method Started ");
        for(int i = 1; i<=number ; i++){
            if(p.test(i)){
                log.info(String.valueOf(i));
            }
        }
        log.info("Method Finished ");

    }
}
