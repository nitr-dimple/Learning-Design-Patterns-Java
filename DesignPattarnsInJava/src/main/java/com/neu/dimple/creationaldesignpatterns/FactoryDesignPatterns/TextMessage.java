package com.neu.dimple.creationaldesignpatterns.FactoryDesignPatterns;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class TextMessage extends Message{

    @Override
    public String getContent() {
        return "Text";
    }
}
