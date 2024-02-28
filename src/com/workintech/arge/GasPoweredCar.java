package com.workintech.arge;


public class GasPoweredCar extends CarSkeleton {

    private double averageKmPerLiter;
    private int cylinders;
    private int batterySize;

    public GasPoweredCar(String name, String description, double averageKmPerLiter, int cylinders,int batterySize) {
        super(name, description);
        this.averageKmPerLiter = averageKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public void setAverageKmPerLiter(double averageKmPerLiter) {
        this.averageKmPerLiter = averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }
}
