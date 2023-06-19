package com.neu.dimple.creationaldesignpatterns.FactoryDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
abstract class Plan {

    protected double rate;

    abstract void getRate();

    public void calculateBill(int units){
        System.out.println("Total Bill is: "+ units * rate );
    }
}
