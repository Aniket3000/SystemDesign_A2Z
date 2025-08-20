package DesignPatterns.Builder;

public class CarBuilder implements Builder{
    private Car car;
    public CarBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats() {
//        set seats
    }

    @Override
    public void setEngine() {
//        Install given engine
    }

    @Override
    public void setTripComputer() {
//        Install tripcomputer
    }

    @Override
    public void setGPS() {
//        install gps
    }

    // Usually, after returning the end result to the client, a
    // builder instance is expected to be ready to start
    // producing another product. That's why it's a usual
    // practice to call the reset method at the end of the
    // `getProduct` method body. However, this behavior isn't
    // mandatory, and you can make your builder wait for an
    // explicit reset call from the client code before disposing

    public Car getProduct(){
        Car product = this.car;
        this.reset();
        return product;
    }
}
