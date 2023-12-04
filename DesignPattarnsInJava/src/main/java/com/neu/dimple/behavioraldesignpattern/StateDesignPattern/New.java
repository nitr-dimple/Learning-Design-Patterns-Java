package com.neu.dimple.behavioraldesignpattern.StateDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class New implements OrderState{


    @Override
    public double handleCancellation() {
        System.out.println("It's a new order. No processing done");
        return 0;
    }
}
