package com.neu.dimple.creationaldesignpatterns.SingletonDesignPattern.EagerSingleton;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class EagerRegistry {

    // To prevent instance creation
    private EagerRegistry(){

    }

    private static final EagerRegistry INSTANCE = new EagerRegistry();

    public static EagerRegistry getInstance(){
        return INSTANCE;
    }
}
