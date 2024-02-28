package com.workintech.carCompany;

public class Mitsubishi extends Car {

    private int justMitsubishi;

    public Mitsubishi(int cylinders,String name ) {
        super(cylinders, name);
    }

    @java.lang.Override
    public String startEngine() {
        super.startEngine();
        return getName() + "engine is starting";
    }

    @java.lang.Override
    public String accelerate() {
         super.accelerate();
         return getName() + "is accelerate";
    }

    @java.lang.Override
    public String brake() {
        super.brake();
        return getName() + "is braking";
    }
}
