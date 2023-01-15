package Transport;

public abstract class Car {
    private String name;
    private String type;
    private String color;
    private double speed;
    private boolean isSuv;
    private boolean isPassengerCar;

    public Car(String name, String type, String color, double speed, boolean isSuv, boolean isPassengerCar) {
        this.name = name;
        this.type = type;
        this.color = color;
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

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
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

