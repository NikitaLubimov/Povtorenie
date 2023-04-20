package org.example.geekbrains;

public class Dog extends Animal{

    @Override
    void say() {
        System.out.println("Собака гавкает");
    }

    @Override
    void run() {
        System.out.println("Собка бежит");
    }

}
