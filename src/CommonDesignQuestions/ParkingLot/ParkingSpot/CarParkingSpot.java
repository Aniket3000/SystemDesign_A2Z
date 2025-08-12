package CommonDesignQuestions.ParkingLot.ParkingSpot;

import CommonDesignQuestions.ParkingLot.VehicleType.VehicleType;

public class CarParkingSpot extends ParkingSpot{
    public CarParkingSpot(){
        super(VehicleType.CAR);
    }
    @Override
    public int setPrice() {
        return 100;
    }
}
