package com.example.javaprogramrunner.SOLID.BirdV5;

public class Eagle  extends Bird implements Flyable {
    HighFlying highFlying ;
    Eagle(){
      highFlying = new HighFlying();
     }

    @Override
    public void fly() {
        //System.out.println("Eagle Flying High");
        highFlying.flyHigh();
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle Making Sound");
    }
}
