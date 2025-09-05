package DesignPatterns.ChainOfResponsibility;

public class Client {
    MoneyHandler thoushandHandler = new ThousandHandler(3);
    MoneyHandler fiveHundredHandler = new FiveHundredHandler(5);

//  Setting COR chain here
    public void main(){
        thoushandHandler.setNextHandler(fiveHundredHandler);

        int amount = 3000;
        thoushandHandler.dispense(amount);
    }
}
