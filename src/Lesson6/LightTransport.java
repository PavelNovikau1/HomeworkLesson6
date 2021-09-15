package Lesson6;
public class LightTransport extends LandTransport {

    String bodyType;
    int numberOfPassengers;
    int fuelConsumptionPerDrive;

    public LightTransport(int powerHp,
                          int maxSpeed,
                          int weight,
                          String model,
                          int numberOfWheels,
                          int fuelConsumption,
                          String bodyType,
                          int numberOfPassengers) {
        super(powerHp,
                maxSpeed,
                weight,
                model,
                numberOfWheels,
                fuelConsumption);
        this.powerHp = powerHp;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;

    }

    public void information() {
        System.out.println("Мощность транспорта: " + powerHp + "л/с; максимальная скорость: "
                + maxSpeed + "км/ч; масса: " + weight + "кг; модель: " +
                model + " количество колес: " + numberOfWheels
                + "шт; расход топлива: " + fuelConsumption + "л/100км; тип кузова: " +
                " " + bodyType + "; количество пассажиров: " + numberOfPassengers
                + "шт; мощность в кВт: " + powerKwt() + " кВт.");
    }

    private double powerKwt() {
        return powerHp * 0.74;
    }


    public void drivingPerformance(int time) {

        int distance = maxSpeed * time;
        calculationOfFuelConsumption(distance);


        System.out.println("За время " + time + " часов автомобиль "
                + model + ", двигаясь с максимальной скоростью "
                + maxSpeed + "км/ч, проедет " + distance +
                "км и израсходует " + fuelConsumptionPerDrive + " литров топлива!");


    }

    public void calculationOfFuelConsumption(int distance) {

        fuelConsumptionPerDrive = distance / fuelConsumption;
    }
}