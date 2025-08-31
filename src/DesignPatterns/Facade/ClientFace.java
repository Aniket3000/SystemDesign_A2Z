package DesignPatterns.Facade;

public class ClientFace {

//    Here you only have information about one class Facade wihch will hold whatever you need here
    public Facade facade = new Facade();

    public void executeThings(){
//        Do your things here by using facade
        facade.execute();
    }

}
