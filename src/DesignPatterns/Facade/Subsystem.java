package DesignPatterns.Facade;

public class Subsystem {
//    here it's a combo of different classes
//    here you se these different susbystems maybe
    public static void toRun(){
        SubSystemA.a();
    }

    public static void toDisplay(){
        SubSystemB.b();
    }
}

class SubSystemA{
    public static void a(){
//        do something;
    }
}
class SubSystemB{
    public static void b(){
//        do something;
        SubSystemA.a();
    }
}

class SubSystemC{
    public static void c(){
//        do something;
        SubSystemB.b();
    }
}

