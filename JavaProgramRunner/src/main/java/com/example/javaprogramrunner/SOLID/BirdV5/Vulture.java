package com.example.javaprogramrunner.SOLID.BirdV5;

public class Vulture extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println(" Vulture Flying High");
    }

    @Override
    public void makeSound() {
        System.out.println("Vulture Making Sound");
    }
}
