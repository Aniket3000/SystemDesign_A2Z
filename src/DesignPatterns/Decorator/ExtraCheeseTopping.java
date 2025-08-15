package DesignPatterns.Decorator;

public class ExtraCheeseTopping extends ToppingDecorator{
    BasePizza basePizza;
    public ExtraCheeseTopping(BasePizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public int getCost() {
        return basePizza.getCost() + 10;
    }
}
