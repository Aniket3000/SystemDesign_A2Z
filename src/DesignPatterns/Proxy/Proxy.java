package DesignPatterns.Proxy;

public class Proxy implements DisplayInterface{
    String filename;
    DisplayInterface realImageDisplay;

    public Proxy(String filename){
        this.filename = filename;
        realImageDisplay = null;
    }
    @Override
    public void display() {
        if(realImageDisplay == null){
            realImageDisplay = new Display(filename);
        }
//        Do some preprocessing here instead of in constructor in other function or anywhere
        realImageDisplay.display();
    }
}
