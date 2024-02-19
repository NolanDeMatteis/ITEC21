package com.nolan.itec.chatquestions;

public class ElectricCar extends Vehicle {
    private int batteryCapacity, range;

    public ElectricCar(String ownerName, String vehicleType, String registrationNumber, int batteryCapacity, int range) {
        super(ownerName, vehicleType, registrationNumber);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    @Override
    public String drive() {
        return "The electric car turns on";
    }

    @Override
    public String steer() {
        return "You turn the electric car's wheel";
    }


}
