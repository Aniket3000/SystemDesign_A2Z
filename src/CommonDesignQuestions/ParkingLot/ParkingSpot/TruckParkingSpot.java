package CommonDesignQuestions.ParkingLot.ParkingSpot;

import CommonDesignQuestions.ParkingLot.VehicleType.VehicleType;

public class TruckParkingSpot extends ParkingSpot{
    public TruckParkingSpot(){
        super(VehicleType.TRUCK);
    }
    @Override
    public int setPrice(){
        return 200;
    }
}
