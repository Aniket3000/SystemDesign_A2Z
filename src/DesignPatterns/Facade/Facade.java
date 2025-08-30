package DesignPatterns.Facade;

public class Facade {

//    You call different components of the subsstem here
    public void execute(){
        Subsystem.toDisplay();
        SubSystemA.a();
        SubSystemB.b();
    }
}
