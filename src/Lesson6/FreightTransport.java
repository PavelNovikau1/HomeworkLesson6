package Lesson6;

import java.util.Scanner;

public class FreightTransport extends LandTransport {
    Scanner scan = new Scanner(System.in);
    int carryingCapacity;

    public FreightTransport(int powerHp,
                            int maxSpeed,
                            int weight,
                            String model,
                            int numberOfWheels,
                            int fuelConsumption,
                            int carryingCapacity) {
        super(powerHp, maxSpeed, weight, model, numberOfWheels, fuelConsumption);

        this.powerHp = powerHp;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
        this.carryingCapacity = carryingCapacity;
    }

    public void information() {
        System.out.println("Мощность транспорта: " + powerHp + "л/с; максимальная скорость: "
                + maxSpeed + "км/ч; масса: " + weight + "кг; модель: " +
                model + " количество колес: " + numberOfWheels
                + "шт; расход топлива: " + fuelConsumption + "; грузоподъемность: " + carryingCapacity
                + "т; мощность в кВт: " + powerKwt() + " кВт.");

    }

    private double powerKwt() {
        return powerHp * 0.74;
    }

    public void loadCapacityCheck() {
        System.out.print("Введите массу груза, которую хотите перевести: ");
        Scanner in = new Scanner(System.in);
        int inputWeight = in.nextInt();
        if (inputWeight <= carryingCapacity) {
            System.out.println("грузовик загружен!");
        } else {
            System.out.println("Вам нужен грузовик побольше!");
        }
    }

}