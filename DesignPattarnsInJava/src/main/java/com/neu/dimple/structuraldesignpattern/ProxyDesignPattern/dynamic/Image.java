package com.neu.dimple.structuraldesignpattern.ProxyDesignPattern.dynamic;

import javafx.geometry.Point2D;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public interface Image {

    void setLocation(Point2D point2D);

    Point2D getLocation();

    void render();
}
