package DesignPatterns.ObserverDesign.Observer;

import DesignPatterns.ObserverDesign.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    StocksObservable observable;
    @Override
    public void update() {
        System.out.println("mail sent!!");
    }
}
