package Transport.CIvilVehicles;

public abstract class CivilVehicles {
    private String name;
    private String type;
    private double speed;
    private boolean isSuv;
    private boolean isPassengerCar;

    public CivilVehicles(String name, String type, double speed, boolean isSuv, boolean isPassengerCar) {
        this.name = name;
        this.type = type;
        this.speed = speed;
        this.isSuv = isSuv;
        this.isPassengerCar = isPassengerCar;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public double getSpeed() {
        return speed;
    }

    public void setSuv(boolean isSuv) {
        this.isSuv = isSuv;
    }
    public boolean isSuv() {
        return isSuv;
    }

    public void setPassengerCar(boolean isPassengerCar) {
        this.isPassengerCar = isPassengerCar;
    }
    public boolean isPassengerCar() {
        return isPassengerCar;
    }

    public abstract void gas();

    public abstract void brake();

    public String display() {
        return "Название: " + name + '\'' +
                "Тип: " + type + '\'' +
                "Макс.скорость: " + speed + '\'' +
                "Легковая: " + (isPassengerCar ? "Да" : "Нет") + '\'' +
                "Внедорожник: " + (isSuv ? "Да" : "Нет");
    }
}

