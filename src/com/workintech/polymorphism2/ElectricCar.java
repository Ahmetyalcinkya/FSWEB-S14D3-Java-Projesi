package com.workintech.polymorphism2;

public class ElectricCar extends CarSkeleton {

    private double avgKmPerCharge;
    private int batterySize;
    public ElectricCar(String name, String description,
                       double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("You have started the EE.");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "avgKmPerCharge=" + avgKmPerCharge +
                ", batterySize=" + batterySize +
                '}';
    }
}
