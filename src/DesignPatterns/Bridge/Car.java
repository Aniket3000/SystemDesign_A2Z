package DesignPatterns.Bridge;

public abstract class Car {
    protected Engine engine;

    public Car(Engine e){
        engine = e;
    }

    public abstract void drive();
}
