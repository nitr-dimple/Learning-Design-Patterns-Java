package com.neu.dimple.structuraldesignpattern.DecoratorDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Client {

    public static void main(String[] args) {
        Message message = new TextMessage("The <FORCE> is strong with this one");
        System.out.println(message.getContent());

        Message message1 = new HTMLEncodedMessage(message);
        System.out.println(message1.getContent());

        Message message2 = new Base64EncodedMessage(message);
        System.out.println(message2.getContent());
    }
}
