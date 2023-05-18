package com.neu.dimple.observer_design_pattern;

import java.util.ArrayList;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + observerIndex + 1 + " deleted");
        observers.remove(observerIndex);

    }

    @Override
    public void notifyObserver() {

        for(Observer observer: observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public double getIbmPrice() {
        return ibmPrice;
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public double getAaplPrice() {
        return aaplPrice;
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();

    }

    public double getGoogPrice() {
        return googPrice;
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}
