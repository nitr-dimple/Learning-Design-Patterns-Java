package com.neu.dimple.creationaldesignpatterns.SingletonDesignPattern.EagerSingleton;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Client {

    public static void main(String[] args) {
        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry1 = EagerRegistry.getInstance();

        System.out.println(registry == registry1);
    }
}
