package DesignPatterns.Factorymethod;

public class RestaurantCreator {
    BurgerInf Burger;
    public RestaurantCreator(BurgerInf Burger){
        this.Burger = Burger;
    }
//    And here use whatever the burger you want this is constructor injection here
//    or we can go like below this is string injection based on the input we recieve we here only create

    public BurgerInf getBurger(String input){
        switch (input) {
            case "Veggie" :
                return new VeggieBurgerConcrete();
            case "Beef":
                return new BeefBurgerConcrete();
            default:
                return null;
        }
    }

    public int calculatePrice(String input){
        BurgerInf Burgerr = getBurger(input);
        return Burgerr.price();
    }
}
