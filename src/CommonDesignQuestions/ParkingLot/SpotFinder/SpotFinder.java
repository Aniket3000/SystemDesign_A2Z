package CommonDesignQuestions.ParkingLot.SpotFinder;

import CommonDesignQuestions.ParkingLot.ParkingSpot.*;
import CommonDesignQuestions.ParkingLot.VehicleType.VehicleType;

import java.util.List;

public abstract class SpotFinder{
//    public abstract CommonDesignQuestions.ParkingLot.ParkingSpot useSpotStrategy(); --- use this if you want to impelemnt it like factory
    public abstract ParkingSpot findSpot(List<ParkingSpot> parkingSpotList, VehicleType vehicleType);
}