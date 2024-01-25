package com.example.Java8Demo.FunctionalInterfaces.Addition;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AddNumbers implements Addition{


    @Override
    public void add(int a, int b) {
        log.info("Sum : "+ a+b);
    }

    public static void main(String[] args) {

        Addition addition = new AddNumbers();
        addition.add(4,5);
        Addition addition1 = (x,y) -> log.info("Inside Anonymous Sum: "+ (x+y));
        addition1.add(4,5);
    }
}
