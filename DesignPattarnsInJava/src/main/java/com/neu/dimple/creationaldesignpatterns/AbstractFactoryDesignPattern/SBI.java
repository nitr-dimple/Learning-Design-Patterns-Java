package com.neu.dimple.creationaldesignpatterns.AbstractFactoryDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class SBI implements Bank{

    private final String name;

    public SBI(){
        name = "SBI";
    }

    @Override
    public String getBankName() {
        return name;
    }
}
