package Lesson6;

abstract class AirTransport extends Transport {

    int wingspan;
    int minRunwayLength;

    public AirTransport(int powerHp,
                        int maxSpeed,
                        int weight,
                        String model,
                        int wingspan,
                        int minRunwayLength) {
        super(powerHp, maxSpeed, weight, model);
    }
}
