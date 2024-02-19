package com.nolan.itec.chatquestions;

public class Main {



    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{new Bicycle(), new ElectricCar(), new ElectricScooter()};

        for(Vehicle vehicle : vehicles){

            System.out.println("Currently using the " + vehicle.toString());
            System.out.println(vehicle.drive());
            System.out.println(vehicle.steer());

        }

    }

}
