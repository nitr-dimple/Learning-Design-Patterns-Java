package com.neu.dimple.AbstractFactoryDesignPattern;

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
