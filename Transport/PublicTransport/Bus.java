package Transport.PublicTransport;

import Transport.Car;

public class Bus extends Car implements PublicTransportInterface {
    private boolean isSchoolBus;
    private int busNumber;

    public Bus(String name, String type, String color, double speed, boolean isSuv, boolean isPassengerCar,
               boolean isSchoolBus, int busNumber) {
        super(name, type, color, speed, isSuv, isPassengerCar);
        this.isSchoolBus = isSchoolBus;
        this.busNumber = busNumber;
    }

    public void setSchoolBus(boolean isSchoolBus) {
        this.isSchoolBus = isSchoolBus;
    }
    public boolean isSchoolBus() {
        return isSchoolBus;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }
    public int getBusNumber() {
        return busNumber;
    }

    @Override
    public void gas() {
        System.out.println(getName() + " газует");
    }

    @Override
    public void brake() {
        System.out.println(getName() + " тормозит");
    }

    @Override
    public void showInfo() {
        System.out.println("Номер автобуса: " + getBusNumber() + '\'' +
                "Это школьный автобус: " + isSchoolBus());
    }

    @Override
    public String drivingTime(String time) {
        return "Время езды автобуса: " + time;
    }

    @Override
    public String display() {
        return super.display();
    }
}
