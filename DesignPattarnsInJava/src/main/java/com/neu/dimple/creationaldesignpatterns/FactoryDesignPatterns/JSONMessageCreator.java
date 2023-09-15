package com.neu.dimple.creationaldesignpatterns.FactoryDesignPatterns;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class JSONMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
