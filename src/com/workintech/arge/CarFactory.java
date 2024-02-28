package com.workintech.arge;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton carSkeleton = new ElectricCar("tesla", "elecrtical car",100,4);

        CarSkeleton hybridCar = new HybridCar("asada", "sssss",0.03,500,5);

        CarSkeleton gasCar = new GasPoweredCar("toog", "electrical",0.08, 500, 100);

        System.out.println(carSkeleton.drive() );
        System.out.println(hybridCar.drive());
        System.out.println(gasCar.drive());
    }
}
