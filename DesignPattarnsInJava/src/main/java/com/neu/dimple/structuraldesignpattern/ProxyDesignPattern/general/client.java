package com.neu.dimple.structuraldesignpattern.ProxyDesignPattern.general;

import javafx.geometry.Point2D;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class client {


    public static void main(String[] args) {
        Image image = ImageFactory.getImage("A1.bmp");

        image.setLocation(new Point2D(10,10));
        System.out.println("Image location: " + image.getLocation());
        System.out.println("Rending image now...");
        image.render();
    }

}
