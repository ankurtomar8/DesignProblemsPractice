package com.example.javaprogramrunner.SOLID.BirdV5;

public class Sparrow extends Bird implements Flyable {
    LowFlying lowFlying;
    Sparrow(){
        lowFlying = new LowFlying();
    }

    @Override
    public void fly() {
        // System.out.println("Flying low");
        lowFlying.flyLow();
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow Making Sound ");
    }
}
