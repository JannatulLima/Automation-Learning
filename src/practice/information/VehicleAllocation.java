package practice.information;

public class VehicleAllocation implements VehicularAttributes, ProfessionalDriver {
    String driverName;
    String driverLicenseNo;

    @Override
    public void printDriverName() {
        System.out.println("Driver Name: " + driverName);
    }

    @Override
    public void printDrierLicenseNo() {
        System.out.println("Driver License No: " + driverLicenseNo);
    }
}
