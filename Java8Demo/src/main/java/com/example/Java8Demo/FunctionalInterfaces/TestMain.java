package com.example.Java8Demo.FunctionalInterfaces;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestMain {
    public static void main(String[] args) {

        FunctionInterfaceDemo functionalDemo = new FunctionalDemo();
        functionalDemo.demoMethod();

        FunctionInterfaceDemo functionalDemo1 = () -> log.info("Inside Anonymous function");
        functionalDemo1.demoMethod();

    }
}
