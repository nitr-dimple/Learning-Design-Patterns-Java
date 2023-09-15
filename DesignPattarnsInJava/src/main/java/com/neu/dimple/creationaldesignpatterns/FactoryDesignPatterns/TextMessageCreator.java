package com.neu.dimple.creationaldesignpatterns.FactoryDesignPatterns;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class TextMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
