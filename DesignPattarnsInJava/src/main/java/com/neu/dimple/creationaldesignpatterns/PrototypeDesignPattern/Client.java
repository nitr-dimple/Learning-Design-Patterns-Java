package com.neu.dimple.creationaldesignpatterns.PrototypeDesignPattern;

import javafx.geometry.Point3D;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Client {

    public static void main(String args[]) throws CloneNotSupportedException {

        Swordsman s1 = new Swordsman();

        s1.move(new Point3D(-10,0,0), 20);
        s1.attack();
        System.out.println(s1);

        Swordsman s2 = (Swordsman) s1.clone();
        System.out.println(s2);

    }
}
