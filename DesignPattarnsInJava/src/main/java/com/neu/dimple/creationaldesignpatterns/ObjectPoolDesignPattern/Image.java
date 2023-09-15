package com.neu.dimple.creationaldesignpatterns.ObjectPoolDesignPattern;

import javafx.geometry.Point2D;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public interface Image extends Poolable{

    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);
}
