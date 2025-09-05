package DesignPatterns.Proxy;

public class Display implements DisplayInterface{
    String filename;
    String path;

    public Display(String path){
        this.path = path;
//        Then you can do some preprocessing but this is where proxy comes in you don't do here you do it
    }
    @Override
    public void display() {
//        Display here
    }
}
