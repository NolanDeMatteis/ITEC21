package com.nolan.itec.chatquestions;

public class Bicycle extends Vehicle{
    @Override
    public String drive() {
        return "You step onto the bicycle";
    }

    @Override
    public String steer() {
        return "You turn the bike's handles";
    }
}
