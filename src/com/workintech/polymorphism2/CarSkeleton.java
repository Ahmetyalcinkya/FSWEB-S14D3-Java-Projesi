package com.workintech.polymorphism2;

public class CarSkeleton {

    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine(){
        System.out.println("You have started the engine.");
    }

    public void drive(){
        runEngine();
        System.out.println("You are ready to drive.");

    }

    protected void runEngine(){
        System.out.println("The engine started automatically.");
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
