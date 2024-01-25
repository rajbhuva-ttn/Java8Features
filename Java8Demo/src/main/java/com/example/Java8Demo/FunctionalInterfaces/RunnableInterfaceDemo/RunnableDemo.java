package com.example.Java8Demo.FunctionalInterfaces.RunnableInterfaceDemo;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RunnableDemo {

    public static void main(String[] args) {
        Runnable runnable = ()->{
          log.info("Anonymous Function thread :" + Thread.currentThread().getName() );
        };

        Thread thread = new Thread(runnable);
        thread.start();

        // 2nd Way
        Thread thread1 = new Thread(() -> log.info("Anonymous Function thread :" + Thread.currentThread().getName() ));
        thread1.start();
    }
}
