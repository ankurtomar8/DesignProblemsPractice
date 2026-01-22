package com.example.javaprogramrunner.SOLID.BirdV5;

public class Sparrow extends Bird implements Flyable {
  //  LowFlying lowFlying;
    FlyingBehaviour flyingBehaviour;
    Sparrow(){
        // Old way
        flyingBehaviour = new LowFlying();
        // Dependency Injection
      //  this.flyingBehaviour = flyingBehaviour;
    }

    @Override
    public void fly() {
        // System.out.println("Flying low");
        flyingBehaviour.doFlying();
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow Making Sound ");
    }

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }
}
