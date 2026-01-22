package com.example.javaprogramrunner.SOLID.BirdV5;

public class Pegion extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Pegion Flying ");
    }
    @Override
    public void makeSound(){
        System.out.println("Pegion is making sound");
    }
}
