package com.example.javaprogramrunner.SOLID.BirdV5;

public class Eagle  extends Bird implements Flyable {
  //  HighFlying highFlying ;
    FlyingBehaviour flyingBehaviour;
    Eagle(){
        flyingBehaviour = new HighFlying();
     }

    @Override
    public void fly() {
        //System.out.println("Eagle Flying High");
        flyingBehaviour.doFlying();
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle Making Sound");
    }
}
