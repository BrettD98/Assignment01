package com.assignmnet;

public class Cat extends Animal{
    public Cat(int age, String name) {
        super(age, name);
    }

    public Cat() {
    }

    public void play(){
        System.out.println(getName() + " plays with the toy mouse.");
    }
}
