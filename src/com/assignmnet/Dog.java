package com.assignmnet;

public class Dog extends Animal{
    public Dog(int age, String name) {
        super(age, name);
    }

    public Dog() {
    }

    public void play(){
        System.out.println(getName() + " plays fetch.");
    }
}
