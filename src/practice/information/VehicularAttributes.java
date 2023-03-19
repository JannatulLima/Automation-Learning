package practice.information;

public interface VehicularAttributes {
    String VEHICLE_NAME = "Truck";
    String VEHICLE_REGISTRATION_NO = "11-22-33";
    int vehicleSpeed = 120;

    private static void printVehicleName() {
        System.out.println("Vehicle Name: " + VEHICLE_NAME);
    }

    private void printVehicleRegistrationNo() {
        System.out.println("Vehicle Registration No: " + VEHICLE_REGISTRATION_NO);
    }

    static void printVehicleSpeed() {
        System.out.println("Speed is: " + vehicleSpeed + " KM/H");
    }

    default void printVehicleDetails() {
        printVehicleName();
        printVehicleRegistrationNo();
        printVehicleSpeed();
    }
}
