package com.neu.dimple.observer_design_pattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class GrabStocks {

    public static void  main(String args[]){
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197);
        stockGrabber.setAaplPrice(121);
        stockGrabber.setGoogPrice(676);

        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.unregister(observer1);

    }
}
