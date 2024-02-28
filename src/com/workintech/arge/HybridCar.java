package com.workintech.arge;

public class HybridCar extends CarSkeleton {

    private double avgKmPerLiter;
    private int batterySize;
    private int cylinder;

    public HybridCar(String name, String description, double avgKmPerLiter, int batterySize, int cylinder) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinder = cylinder;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinder() {
        return cylinder;
    }
}
