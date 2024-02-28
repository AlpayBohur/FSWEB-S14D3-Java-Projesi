package com.workintech.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        System.out.println("class name: " + getClass().getSimpleName());
        return getName() + "starting engine. ";
    }
    public String drive(){
        runEngine(this);
        return getName() + "is driving.";
    }

    protected void runEngine(CarSkeleton carSkeleton){
        System.out.println( carSkeleton.getClass().getSimpleName());
        if (carSkeleton instanceof ElectricCar) {
            double kmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
            double batterySize = ((ElectricCar) carSkeleton).getBatterySize();
            System.out.println("the car engine is starting with electric. per charge: " + kmPerCharge + "Battery size: " + batterySize);
        } else if(carSkeleton instanceof HybridCar) {
            HybridCar car =((HybridCar)carSkeleton);
            System.out.println("the car engine is starting with electric. per charge: " + car.getAvgKmPerLiter() + "Battery size: " + car.getBatterySize() + "cylinders: " + car.getCylinder());
        } else if (carSkeleton instanceof GasPoweredCar) {
            GasPoweredCar car =((GasPoweredCar)carSkeleton);
            System.out.println("the car engine is starting with electric. per charge: " + car.getAverageKmPerLiter() + "Battery size: " + car.getBatterySize() + "cylinders: " + car.getCylinders());

        } else  {
            System.out.println("ınvalid car type");
        }
    }
}
