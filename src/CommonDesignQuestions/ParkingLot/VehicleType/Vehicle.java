package CommonDesignQuestions.ParkingLot.VehicleType;

public class Vehicle {
    public String license;
    public VehicleType vehicleType;
    public Vehicle(String plateNumber,VehicleType vehicleType){
        this.license = plateNumber;
        this.vehicleType = vehicleType;
    }
}
