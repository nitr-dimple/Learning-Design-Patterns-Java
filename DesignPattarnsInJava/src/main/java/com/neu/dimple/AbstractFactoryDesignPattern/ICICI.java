package com.neu.dimple.AbstractFactoryDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class ICICI implements Bank{

    private final String name;

    public ICICI(){
        name = "ICICI";
    }

    @Override
    public String getBankName() {
        return name;
    }
}
