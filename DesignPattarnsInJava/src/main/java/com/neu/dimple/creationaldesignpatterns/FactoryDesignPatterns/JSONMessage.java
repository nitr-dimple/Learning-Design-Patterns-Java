package com.neu.dimple.creationaldesignpatterns.FactoryDesignPatterns;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class JSONMessage extends Message{

    @Override
    public String getContent() {
        return "{\"JSON]\":[]}";
    }
}
