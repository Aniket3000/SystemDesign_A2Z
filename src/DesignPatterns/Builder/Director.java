package DesignPatterns.Builder;
// The director is only responsible for executing the building
// steps in a particular sequence. It's helpful when producing
// products according to a specific order or configuration.
// Strictly speaking, the director class is optional, since the
// client can control builders directly.

public class Director {
    public void constructSportsCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportEngine())
        builder.setTripComputer(true)
        builder.setGPS(true)
    }
    public void constructSUV(Builder builder){
//        similar
    }
}
