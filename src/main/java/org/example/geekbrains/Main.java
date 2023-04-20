package org.example.geekbrains;

public class Main {
    public static void main(String[] args) {

        // Задание №1
        Person person = Person.newBuilder()
                .setFirstName("q")
                .setLastName("w")
                .setMiddleName("e")
                .setCountry("r")
                .setAddress("t")
                .setAge(0)
                .setPhone("+20")
                .setGender("F")
                .build();
        System.out.println(person);

        /* Задание №2
        1. Интерфейсы Moveable и Stopable можно объединить в один Action.
        2. Методы start и open перенести в интерфейс Action.
        3. Определять поведение метода start не имеет смысла, он зависимости от типа машины.
        4. Car может имплементировать интерфейс Action, а потомкам в данном случае будет достаточно наследования от Car.
         */

        // Задание №3
        // 1 пример полиморфизма. Возможность обращение к разным типам обьекта по одному общему типу родительской ссылки.
        // Например разных животных(Animal) сложить в один массив как будто это один тип данных.
        Animal[] animals = new Animal[]{
                new Bird(),
                new Dog(),
                new Cat()
        };

        // 2 пример полиморфизма. Переопределение метода унаследованого от родителя.
        Animal animalDog = new Dog();
        animalDog.say();

        // 3 пример полиморфизма. Перегрузка метода.
        Bird bird = new Bird();
        bird.run();
        bird.run(10);

    }
}