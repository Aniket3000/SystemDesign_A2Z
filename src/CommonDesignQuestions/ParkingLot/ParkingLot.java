package CommonDesignQuestions.ParkingLot;

import CommonDesignQuestions.ParkingLot.ParkingSpot.CarParkingSpotManager;
import CommonDesignQuestions.ParkingLot.ParkingSpot.ParkingSpotManager;
import CommonDesignQuestions.ParkingLot.ParkingSpot.TruckParkingSpotManager;
import CommonDesignQuestions.ParkingLot.VehicleType.Vehicle;
import CommonDesignQuestions.ParkingLot.VehicleType.VehicleType;

public class ParkingLot {
    public static ParkingLot parkingLot;
    public static ParkingSpotManager carParkingSpotManager;
    public static ParkingSpotManager truckParkingSpotManager;
    public static ParkingLot getInstance(){
        if(parkingLot == null){
            parkingLot = new ParkingLot();
            carParkingSpotManager = new CarParkingSpotManager(10);
            truckParkingSpotManager = new TruckParkingSpotManager(20);
        }
        return parkingLot;
    }
    public void addVehicle(Vehicle vehicle){
        if(vehicle.vehicleType == VehicleType.CAR){
            carParkingSpotManager.addVehicle(vehicle);
        }else{
            truckParkingSpotManager.addVehicle(vehicle);
        }
        System.out.println("Vehicle1 done");
    }
    public void removeVehicle(Vehicle vehicle){
        if(vehicle.vehicleType == VehicleType.CAR){
            carParkingSpotManager.removeVehicle(vehicle);
        }else {
            truckParkingSpotManager.removeVehicle(vehicle);
        }
    }
}
