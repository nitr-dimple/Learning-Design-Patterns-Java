package com.neu.dimple.AbstractFactoryDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class HDFC implements Bank{

    private final String name;

    public HDFC(){
        name = "HDFC";
    }

    @Override
    public String getBankName() {
        return name;
    }
}
