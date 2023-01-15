package Transport.CIvilVehicles;

import Transport.Car;

public class SuvCar extends Car implements Suvable {

    public SuvCar(String name, String type, String color, double speed, boolean isSuv, boolean isPassengerCar) {
        super(name, type, color, speed, isSuv, isPassengerCar);
    }

    {
        setSuv(true);
        setPassengerCar(false);
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
    public void fourWheelDriveOn() {
        System.out.println("Включился полный привод.");
    }

    @Override
    public void callSuv() {
        System.out.println("This is" + getType() + " by " + getName());
    }

    @Override
    public String display() {
        return super.display();
    }
}
