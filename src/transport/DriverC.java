package transport;

public class DriverC extends Driver {

    public DriverC(String fullName, boolean driversLicense, int drivingExperience) {
        super(fullName, driversLicense, drivingExperience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель с правами категории C "+ getFullName() + " начал движение.");
    }
    @Override
    public void stopMoving() {
        System.out.println("Водитель с правами категории C "+ getFullName() + " закончил движение.");
    }
    @Override
    public void refuelAuto() {
        System.out.println("Водитель с правами категории C "+ getFullName() + " заправляет автомобиль.");
    }
}
