package com.neu.dimple.structuraldesignpattern.FacadeDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class StationaryFactory {

    public static Stationary createStationary(){
        return new HalloweenStationary();
    }
}
