package com.nolan.itec.chatquestions;

public abstract class Vehicle {
    private String ownerName, vehicleType, registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }


    public abstract String drive();
    public abstract String steer();


    @Override
    public String toString() {
        return "Vehicle Owner: " + ownerName + "\n" +
                "Vehicle type: " + vehicleType;
    }


    /*
     *  GETTERS AND SETTERS
     */

    public String getOwnerName() {
        return ownerName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
