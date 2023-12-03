package com.neu.dimple.structuraldesignpattern.ProxyDesignPattern.general;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class ImageFactory {

    public static Image getImage(String name){
        return new ImageProxy(name);
    }
}
