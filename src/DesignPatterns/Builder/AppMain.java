package DesignPatterns.Builder;

public class AppMain {
    public void makeCar(){
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSUV(builder);
        Car car = builder.getProduct();
    }
}
