package com.neu.dimple.structuraldesignpattern.FacadeDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class HalloweenStationary implements Stationary {
    @Override
    public String getHeader() {
        return "Its Halloween!!";
    }

    @Override
    public String getFooter() {
        return "BUY MORE STUFF! It's Halloween c'mon!!";
    }
}
