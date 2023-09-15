package com.neu.dimple.creationaldesignpatterns.AbstractFactoryDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class GoogleResourceFactory implements ResourceFactory{
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputerEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
