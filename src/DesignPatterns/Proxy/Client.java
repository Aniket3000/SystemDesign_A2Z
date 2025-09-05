package DesignPatterns.Proxy;

public class Client {
    public void main(){
        DisplayInterface dispProxy = new Proxy("asdfaf");
        dispProxy.display();
    }
}
