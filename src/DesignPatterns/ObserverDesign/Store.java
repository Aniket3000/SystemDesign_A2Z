package DesignPatterns.ObserverDesign;

import DesignPatterns.ObserverDesign.Observable.IphoneObservableConcrete;
import DesignPatterns.ObserverDesign.Observable.StocksObservable;
import DesignPatterns.ObserverDesign.Observer.EmailAlertObserverImpl;
import DesignPatterns.ObserverDesign.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String args[]){
        StocksObservable iphoneStockObservable = new IphoneObservableConcrete();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl();
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl();

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);

        iphoneStockObservable.setStockCount(10);
    }
}
