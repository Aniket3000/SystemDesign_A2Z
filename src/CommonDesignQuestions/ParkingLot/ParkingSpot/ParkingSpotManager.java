package CommonDesignQuestions.ParkingLot.ParkingSpot;

import CommonDesignQuestions.ParkingLot.VehicleType.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import CommonDesignQuestions.ParkingLot.SpotFinder.*;
import CommonDesignQuestions.ParkingLot.VehicleType.VehicleType;

public abstract class ParkingSpotManager {
    public List<ParkingSpot> parkingSpots;
    public SpotFinder spotFinder;
    public ParkingSpotManager(ArrayList<ParkingSpot> objects,SpotFinder spotFinder,int cap) {
        this.parkingSpots = objects;
        this.spotFinder = spotFinder;
        if(cap == 10) {
            for (int i = 0; i < cap; i++) {
                this.parkingSpots.add(new CarParkingSpot());
            }
        }else{
            for (int i = 0; i < cap; i++) {
                this.parkingSpots.add(new TruckParkingSpot());
            }
        }
    }

    public void addVehicle(Vehicle vehicle){
        ParkingSpot parkingSpot = findNearestSpot(vehicle.vehicleType);
        parkingSpot.addVehicle(vehicle);
        System.out.println("Vehicle added to spot!");
    }
    public void removeVehicle(Vehicle vehicle){
        for(ParkingSpot parkingSpot : parkingSpots){
            if(!parkingSpot.spotAvailable() && Objects.equals(vehicle,parkingSpot.vehicle)){
                parkingSpot.removeVehicle();
                System.out.println("Vehicle Exited!");
            }
        }
    }

    public ParkingSpot findNearestSpot(VehicleType vehicleType){
        return spotFinder.findSpot(parkingSpots,vehicleType);
    }
}
