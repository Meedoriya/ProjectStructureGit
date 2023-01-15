package Transport.CIvilVehicles;

import Transport.CIvilVehicles.CivilVehicles;
import Transport.CIvilVehicles.Suvable;

public class SuvCar extends CivilVehicles implements Suvable {

    public SuvCar(String name, String type, double speed, boolean isSuv, boolean isPassengerCar) {
        super(name, type, speed, isSuv, isPassengerCar);
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
        System.out.println("This is SUV by " + getName());
    }

    @Override
    public String display() {
        return super.display();
    }
}
