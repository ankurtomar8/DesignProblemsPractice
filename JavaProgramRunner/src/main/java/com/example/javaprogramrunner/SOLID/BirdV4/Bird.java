package com.example.javaprogramrunner.SOLID.BirdV4;

public abstract class Bird {
    private String name;
    private int age;
    private int numberOfLegs;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void eat(){
        System.out.println("Bird is eating");
    }

    public void makeSound(){
        System.out.println("Bird is making sound");
    }

    public abstract void fly();

}
