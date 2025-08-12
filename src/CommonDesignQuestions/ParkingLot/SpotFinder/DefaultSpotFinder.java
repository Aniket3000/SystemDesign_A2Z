package CommonDesignQuestions.ParkingLot.SpotFinder;

import CommonDesignQuestions.ParkingLot.ParkingSpot.*;
import CommonDesignQuestions.ParkingLot.VehicleType.*;

import java.util.List;

public class DefaultSpotFinder extends SpotFinder {
    public ParkingSpot findSpot(List<ParkingSpot> parkingSpotList, VehicleType vehicleType) {
        ParkingSpot spot = null;
        for(ParkingSpot parkingSpot : parkingSpotList){
            if(parkingSpot.spotAvailable() && parkingSpot.vehicleType == vehicleType){
                spot = parkingSpot;
                break;
            }
        }
        return spot;
    }
}
