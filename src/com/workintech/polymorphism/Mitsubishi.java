package com.workintech.polymorphism;

public class Mitsubishi  extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("The "+ getClass().getSimpleName() + " " + getName() + "'s engine is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println("The "+ getClass().getSimpleName() + " " + getName() + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The "+ getClass().getSimpleName() + " " + getName() + " is braking");
    }
}
