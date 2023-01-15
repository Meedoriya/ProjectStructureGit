package Transport.CIvilVehicles;

import Transport.Car;

public class PassengerCar extends Car implements PassengerCarable {

    public PassengerCar(String name, String type, String color, double speed, boolean isSuv, boolean isPassengerCar) {
        super(name, type, color, speed, isSuv, isPassengerCar);
    }

    {
        setPassengerCar(true);
        setSuv(false);
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
    public void callPassengerCar() {
        System.out.println("This is " + getType() + " car by " + getName());
    }

    @Override
    public String display() {
        return super.display();
    }
}
