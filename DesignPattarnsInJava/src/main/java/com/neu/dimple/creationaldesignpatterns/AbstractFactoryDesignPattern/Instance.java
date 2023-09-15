package com.neu.dimple.creationaldesignpatterns.AbstractFactoryDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public interface Instance {

    enum Capacity{micro, small, large}

    void start();

    void attachStorage(Storage storage);

    void stop();
}
