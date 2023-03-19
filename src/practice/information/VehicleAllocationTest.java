//assignment 6, item1 (interface with multiple practice.inheritance)
package practice.information;

public class VehicleAllocationTest {
    public static void main(String[] args) {
        VehicleAllocation vehicleAllocation = new VehicleAllocation();
        System.out.println("========== Driver Details ==========");
        vehicleAllocation.driverName = "Abul Khayer";
        vehicleAllocation.driverLicenseNo = "123243";
        vehicleAllocation.printDriverName();
        vehicleAllocation.printDrierLicenseNo();
        System.out.println("\n" + "========== Allocated Vehicle Details ==========");
        vehicleAllocation.printVehicleDetails();
    }
}
