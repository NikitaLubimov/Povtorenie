package org.example.geekbrains;

public class Bird extends Animal {

    @Override
    void say() {
        System.out.println("Птица поёт");
    }

    @Override
    void run() {
        System.out.println("Птица летит");
    }

    void run(int speed) {
        System.out.println("Птица летит со скоростью " + speed + " км/ч");
    }
}
