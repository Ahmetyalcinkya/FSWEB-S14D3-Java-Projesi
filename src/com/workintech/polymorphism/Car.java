package com.workintech.polymorphism;

import java.util.Objects;

public class Car {

    private String name;
    private final boolean engine;
    private int cylinders;
    private final int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.name = name;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine(){
        System.out.println("The "+ getClass().getSimpleName() + "'s engine is starting.");
    }
    public void accelerate(){
        System.out.println("The "+ getClass().getSimpleName() + " is accelerating.");
    }
    public void brake(){
        System.out.println("The "+ getClass().getSimpleName() + " car is braking");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                ", cylinders=" + cylinders +
                ", wheels=" + wheels +
                '}';
    }
}
