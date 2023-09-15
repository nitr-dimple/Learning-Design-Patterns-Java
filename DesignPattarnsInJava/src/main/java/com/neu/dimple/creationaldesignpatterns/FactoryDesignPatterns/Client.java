package com.neu.dimple.creationaldesignpatterns.FactoryDesignPatterns;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Client {

    public static void main(String args[]){
        printMessage(new JSONMessageCreator());

    }

    public static void printMessage(MessageCreator creator){
        Message message = creator.getMessage();
        System.out.println(message);
    }
}
