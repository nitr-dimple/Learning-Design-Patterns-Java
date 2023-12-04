package com.neu.dimple.behavioraldesignpattern.StateDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Paid implements OrderState{


    @Override
    public double handleCancellation() {
        System.out.println("Contacting payment gateway to rollback transaction");
        return 10;
    }
}
