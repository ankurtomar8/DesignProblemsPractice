package com.example.javaprogramrunner.SOLID.BirdV5;

import java.util.List;

public class Client {

    public static void doSomething(List<Flyable> birds){
        for(Flyable bird : birds){
            bird.fly();
        }
    }
    public static void main(String[] args) {

        Bird b = new Pegion();
        Pegion b1 = new Pegion();
        Flyable f = new Pegion();

        System.out.println("Hello World");
    }
}
