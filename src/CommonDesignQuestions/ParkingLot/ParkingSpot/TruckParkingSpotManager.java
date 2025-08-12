package CommonDesignQuestions.ParkingLot.ParkingSpot;

import CommonDesignQuestions.ParkingLot.SpotFinder.DefaultSpotFinder;

import java.util.ArrayList;

public class TruckParkingSpotManager extends ParkingSpotManager{
    public TruckParkingSpotManager(int capacity){
        super(new ArrayList<ParkingSpot>(capacity),new DefaultSpotFinder(),capacity);
    }
}
