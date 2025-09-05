package DesignPatterns.Bridge;

public class SUVCar extends Car{
    public SUVCar(Engine e){
        super(e);
    }
    @Override
    public void drive() {
        engine.start();
        System.out.println("Driving SUV car");
    }
}
