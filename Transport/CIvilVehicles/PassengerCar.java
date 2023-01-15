package Transport.CIvilVehicles;

public class PassengerCar extends CivilVehicles implements PassengerCarable {

    public PassengerCar(String name, String type, double speed, boolean isSuv, boolean isPassengerCar) {
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
    public void callPassengerCar() {
        System.out.println("This is passenger car by " + getName());
    }

    @Override
    public String display() {
        return super.display();
    }
}
