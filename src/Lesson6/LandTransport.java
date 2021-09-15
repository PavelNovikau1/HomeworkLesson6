package Lesson6;

abstract class LandTransport extends Transport {

    int numberOfWheels;
    int fuelConsumption;


    public LandTransport(int powerHp,
                         int maxSpeed,
                         int weight,
                         String model,
                         int numberOfWheels,
                         int fuelConsumption) {
        super(powerHp, maxSpeed, weight, model);


    }


}