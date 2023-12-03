package com.neu.dimple.structuraldesignpattern.ProxyDesignPattern.dynamic;

import javafx.geometry.Point2D;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class BitmapImage implements Image {


    private Point2D location;
    private String name;

    public BitmapImage(String filename){
        System.out.println("Loaded from disk: " + filename);
        name = filename;
    }

    @Override
    public void setLocation(Point2D point2D) {
        location = point2D;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        System.out.println("Rendered " + this.name);
    }
}
