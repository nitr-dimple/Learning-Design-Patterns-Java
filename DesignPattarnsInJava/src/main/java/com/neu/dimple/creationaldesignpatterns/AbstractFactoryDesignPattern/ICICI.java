package com.neu.dimple.creationaldesignpatterns.AbstractFactoryDesignPattern;

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
