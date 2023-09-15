package com.neu.dimple.FactoryDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class CommercialPlan extends Plan {

    @Override
    void getRate() {
        rate = 3.5;
    }
}
