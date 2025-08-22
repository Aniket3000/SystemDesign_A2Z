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

// Core idea is here that all participants are sharing the same interface so
// you an wrap the topping with base also provided you're doing constructor injection for that also <- in theory


// Main thing is everything is implementend from BasePizza, concrete base also and topping also