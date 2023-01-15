package Transport.PublicTransport;

import Transport.Car;

public class Tram extends Car implements PublicTransportInterface {
    private int tramNumber;
    private boolean isElectricTram;

    public Tram(String name, String type, String color, double speed, boolean isSuv, boolean isPassengerCar,
                boolean isElectricTram, int tramNumber) {
        super(name, type, color, speed, isSuv, isPassengerCar);
        this.isElectricTram = isElectricTram;
        this.tramNumber = tramNumber;
    }

    public void setElectricTram(boolean isElectricTram) {
        this.isElectricTram = isElectricTram;
    }
    public boolean isElectricTram() {
        return isElectricTram;
    }

    public void setTramNumber(int tramNumber) {
        this.tramNumber = tramNumber;
    }
    public int getTramNumber() {
        return tramNumber;
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
        System.out.println("Номер трамвая: " + getTramNumber() + '\'' +
                "Электрический трамвай: " + isElectricTram());
    }

    @Override
    public String drivingTime(String time) {
        return "Время езды трамвая: " + time;
    }
}
