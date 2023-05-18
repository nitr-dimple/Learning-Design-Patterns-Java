package com.neu.dimple.observer_design_pattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public interface Subject {

    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
