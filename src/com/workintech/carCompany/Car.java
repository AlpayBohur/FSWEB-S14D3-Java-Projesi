package com.workintech.carCompany;

import java.util.Objects;

public class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        System.out.println("class name: " + getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate(){
        System.out.println("class name: " + getClass().getSimpleName());
        return "the car's is accelerating";
    }

    public String brake(){
        System.out.println("class name: " + getClass().getSimpleName());
        return "the car's is braking";
    }



    @java.lang.Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cylinders=" + cylinders +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Car car = (Car) object;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }
}
