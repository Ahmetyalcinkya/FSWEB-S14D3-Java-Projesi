package com.workintech.polymorphism2;

public class HybridCar extends CarSkeleton{

    private double avgKmPerLitre;
    private double batterySize;
    private int cylinders;
    public HybridCar(String name, String description,
                     double avgKmPerLitre, double batterySize,
                     int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("You have started the ICE and EE.");
    }

    @Override
    public String toString() {
        return "HybridCar{" +
                "avgKmPerLitre=" + avgKmPerLitre +
                ", batterySize=" + batterySize +
                ", cylinders=" + cylinders +
                '}';
    }
}
