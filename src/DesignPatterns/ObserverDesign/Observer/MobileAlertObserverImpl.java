package DesignPatterns.ObserverDesign.Observer;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    @Override
    public void update() {
        System.out.println("Mobile notify");
    }
}
