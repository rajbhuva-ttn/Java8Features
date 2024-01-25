package com.example.Java8Demo.FunctionalInterfaces;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FunctionalDemo implements FunctionInterfaceDemo{

    @Override
    public void demoMethod() {
        log.info("Functional Interface working");
    }
}
