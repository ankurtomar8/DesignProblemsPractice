package com.example.javaprogramrunner.SOLID.BirdV4;

public class Peacock extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Peacock Flying ");
    }
    @Override
    public void makeSound(){
        System.out.println("Peacock is making sound");
    }
}
