package RideSharingPlatform.Model;

public class Driver {
    private int driverId;
    private String driverName;
    private String phoneNo;
    Vechicle vechicle;

    public Driver(int driverId, String driverName, String phoneNo, Vechicle vechicle) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.phoneNo = phoneNo;
        this.vechicle = vechicle;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public Vechicle getVechicle() {
        return vechicle;
    }
}
