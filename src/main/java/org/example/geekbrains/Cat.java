package org.example.geekbrains;

public class Cat extends Animal {

    @Override
    void say() {
        System.out.println("Кот мяукает");
    }

    @Override
    void run() {
        System.out.println("Кот идет");
    }
}
