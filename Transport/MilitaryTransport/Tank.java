package Transport.MilitaryTransport;

import Transport.Car;

public class Tank extends Car implements MilitaryTransportInterface {
    private boolean isFly;
    private boolean isShoot;

    public Tank(String name, String type, String color, double speed, boolean isSuv, boolean isPassengerCar,
                   boolean isFly, boolean isShoot) {
        super(name, type, color, speed, isSuv, isPassengerCar);
        this.isFly = isFly;
        this.isShoot = isShoot;
    }

    {
        setType("Танк");
        setFly(false);
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
        System.out.println(getType() + " едет");
    }

    @Override
    public void brake() {
        System.out.println(getType() + " тормозит");
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
