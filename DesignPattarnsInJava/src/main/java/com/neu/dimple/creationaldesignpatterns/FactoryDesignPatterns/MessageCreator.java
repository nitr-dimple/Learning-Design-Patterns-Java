package com.neu.dimple.creationaldesignpatterns.FactoryDesignPatterns;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public abstract class MessageCreator {

    public Message getMessage(){
        Message message = createMessage();
        message.addDefaultHeaders();
        message.encrypt();
        return message;
    }

    //Factory Method
    public abstract Message createMessage();
}
