package com.example.Java8Demo.MethodReference;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MethodRefDemo {

    public static void printThreadName(){

        // In method ref -> Parameter should be same, return type and access modifier not matters
        log.info("Static " + Thread.currentThread().getName());
    }

    public void printNONstaticThreadName(){
        log.info("Non static " +Thread.currentThread().getName());
    }

    public static void main(String[] args) {


        Runnable runnable = MethodRefDemo::printThreadName;
        Thread thread = new Thread(runnable);
        thread.start();

        MethodRefDemo methodRefDemo = new MethodRefDemo();

        Runnable runnable1 = methodRefDemo::printNONstaticThreadName;
        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
