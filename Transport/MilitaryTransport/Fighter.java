package Transport.MilitaryTransport;

import Transport.Car;

public class Fighter extends Car implements MilitaryTransportInterface {
    private boolean isFly;
    private boolean isShoot;

    public Fighter(String name, String type, String color, double speed, boolean isSuv, boolean isPassengerCar,
                   boolean isFly, boolean isShoot) {
        super(name, type, color, speed, isSuv, isPassengerCar);
        this.isFly = isFly;
        this.isShoot = isShoot;
    }

    {
        setType("Истребитель");
        setFly(true);
    }

    public void setFly(boolean isFly) {
        this.isFly = isFly;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setShoot(boolean isShoot) {
        this.isShoot = isShoot;
    }

    public boolean isShoot() {
        return isShoot;
    }

    @Override
    public void gas() {
        System.out.println(getType() + " летит");
    }

    @Override
    public void brake() {
        System.out.println(getType() + " садиться");
    }

    @Override
    public void showInfo() {
        System.out.println("Летает: " + (isFly ? "Да" : "Нет") + '\'' +
                "Стреляет: " + (isShoot ? "Да" : "Нет"));
    }

    @Override
    public void callMilitary() {
        System.out.println("Это военный транспорт.");
    }
}
