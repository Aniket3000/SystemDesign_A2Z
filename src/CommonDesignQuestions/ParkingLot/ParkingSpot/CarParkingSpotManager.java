package CommonDesignQuestions.ParkingLot.ParkingSpot;

import CommonDesignQuestions.ParkingLot.SpotFinder.DefaultSpotFinder;

import java.util.ArrayList;

public class CarParkingSpotManager extends ParkingSpotManager{
    public CarParkingSpotManager(int capacity){
        super(new ArrayList<ParkingSpot>(capacity),new DefaultSpotFinder(),capacity);
    }
}
