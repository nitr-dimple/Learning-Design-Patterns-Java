package com.neu.dimple.creationaldesignpatterns.AbstractFactoryDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capMib);


}
