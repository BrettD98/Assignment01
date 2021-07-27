package com.assignmnet;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal(37, "Oscar");
        Dog dog1 = new Dog(7, "Max");
        Cat cat1 = new Cat(3, "Snowball");

        System.out.println("Name: " + animal1.getName() + " Age: " + animal1.getAge());
        System.out.println("Name: " + dog1.getName() + " Age: " + dog1.getAge());
        System.out.println("Name: " + cat1.getName() + " Age: " +cat1.getAge() + "\n");

        animal1.play();
        dog1.play();
        cat1.play();

    }
}
