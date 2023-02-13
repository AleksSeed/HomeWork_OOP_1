package transport;

import org.w3c.dom.ls.LSOutput;

public abstract class Driver {
    private String fullName;
    private boolean driversLicense;
    private int drivingExperience;
    private static final String DEFAULT_VALUE = "default";

    public Driver(String fullName, boolean driversLicense, int drivingExperience) {
        this.fullName = fullName;
        this.driversLicense = driversLicense;
        this.drivingExperience = drivingExperience;
    }

    public String getFullName() {
        return fullName;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void refuelAuto();


    public void setFullName(String fullName) {
        if(fullName == null || fullName.isBlank() || fullName.isEmpty()) {
            fullName = DEFAULT_VALUE;
        } else {
            fullName = fullName;
        }
    }

    @Override
    public String toString() {
        return fullName + ", наличие лицензии = " + driversLicense + ", водительский стаж = " + drivingExperience + "\n";
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }


    public void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
}
