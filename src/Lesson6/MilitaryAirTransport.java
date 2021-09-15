package Lesson6;

public class MilitaryAirTransport extends AirTransport {

    boolean ejectionSystem;
    int numberOfMissilesOnBoard;


    public MilitaryAirTransport(int powerHp,
                                int maxSpeed,
                                int weight,
                                String model,
                                int wingspan,
                                int minRunwayLength,
                                boolean ejectionSystem,
                                int numberOfMissilesOnBoard) {
        super(powerHp, maxSpeed, weight, model, wingspan, minRunwayLength);

        this.powerHp = powerHp;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
        this.ejectionSystem = ejectionSystem;
        this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;

    }

    public void information() {
        System.out.println("Мощность транспорта: " + powerHp + "л/с; максимальная скорость: "
                + maxSpeed + "км/ч; масса: " + weight + "кг; модель: " +
                model + " ;размах крыльев: " + wingspan
                + "м; минимальная длина впп: " + minRunwayLength + "м.; наличие системы катапультирования: " +
                " " + ejectionSystem + "; количество ракет на борту: " + numberOfMissilesOnBoard
                + "; мощность в кВт: " + powerKwt() + " кВт.");

    }

    private double powerKwt() {
        return powerHp * 0.74;
    }

    void shot() {
        if (numberOfMissilesOnBoard != 0) {
            System.out.println("Ракета пошла!");
        } else {
            System.out.println("Ракеты отсутствуют!");
        }

    }


    public void ejection() {
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно!");
        } else {
            System.out.println("У вас нет такой системы!");
        }
    }
}