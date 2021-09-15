package Lesson6;

import java.util.Scanner;

public class CitizensAirTransport extends AirTransport {

    int numberOfPassengers;
    boolean businessClassAvailability;


    public CitizensAirTransport(int powerHp,
                                int maxSpeed,
                                int weight,
                                String model,
                                int wingspan,
                                int minRunwayLength,
                                int numberOfPassengers,
                                boolean businessClassAvailability) {
        super(powerHp, maxSpeed, weight, model, wingspan, minRunwayLength);

        this.powerHp = powerHp;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
        this.numberOfPassengers = numberOfPassengers;
        this.businessClassAvailability = businessClassAvailability;

    }

    public void information() {
        System.out.println("Мощность транспорта: " + powerHp + "л/с; максимальная скорость: "
                + maxSpeed + "км/ч; масса: " + weight + "кг; модель: " +
                model + " ;размах крыльев: " + wingspan
                + "м; минимальная длина впп: " + minRunwayLength + "м.; количество пассажиров: " + numberOfPassengers
                + "шт; наличие бизнес класса: "
                + "; мощность в кВт: " + powerKwt() + " кВт.");

    }

    private double powerKwt() {
        return powerHp * 0.74;
    }

    public void passengerCapacity() {
        System.out.print("Введите количество пассажиров на регистрации: ");
        Scanner in = new Scanner(System.in);
        int numberOfPassengersInRegistration = in.nextInt();
        if (numberOfPassengersInRegistration <= numberOfPassengers) {
            System.out.println("Пассажиры на своих местах!");
        } else {
            System.out.println("Вам нужен самолет побольше!");
        }
    }

}