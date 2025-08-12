package CommonDesignQuestions.ParkingLot.ParkingSpot;

import CommonDesignQuestions.ParkingLot.CostCalculationStrategy.CostCalc;
import CommonDesignQuestions.ParkingLot.CostCalculationStrategy.HourlyCost;
import CommonDesignQuestions.ParkingLot.VehicleType.*;

public abstract class ParkingSpot {
    public Vehicle vehicle;
    public VehicleType vehicleType;
    private boolean isEmpty = true;
    public int price;
    public abstract int setPrice();
    public ParkingSpot(VehicleType vehicleType){
        this.vehicleType = vehicleType;
    }
    public int getPrice(){
        int priceCalc = setPrice();
        System.out.println(priceCalc);
        return priceCalc;
    }
    public void addVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        isEmpty = false;
    }
    public void removeVehicle(){
        this.vehicle = null;
        isEmpty = true;
//        price calculation
        CostCalc calc = new HourlyCost();
        calc.getCost();
    }
    public boolean spotAvailable(){
        return isEmpty;
    }
}
