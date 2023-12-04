package com.neu.dimple.behavioraldesignpattern.StateDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Delivered implements OrderState{


    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier service for cancellation");
        System.out.println("Payment roll back will be initiated upon receiving returned item");
        return 30;
    }
}
