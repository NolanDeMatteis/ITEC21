package com.nolan.itec.chatquestions;

public class ElectricScooter extends Vehicle{


    @Override
    public String drive() {
        return "You start the electric scooter";
    }

    @Override
    public String steer() {
        return "You turn the electric scooter's handles";
    }
}
