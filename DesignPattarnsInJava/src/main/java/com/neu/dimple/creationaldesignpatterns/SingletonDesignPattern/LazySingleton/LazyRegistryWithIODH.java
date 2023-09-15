package com.neu.dimple.creationaldesignpatterns.SingletonDesignPattern.LazySingleton;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class LazyRegistryWithIODH {

    private LazyRegistryWithIODH(){
        System.out.println("LazyRegistryWithIODH constructor");
    }

    private static class RegistryHolder {
        static LazyRegistryWithIODH INSTANCE = new LazyRegistryWithIODH();
    }

    public  static LazyRegistryWithIODH getInstance(){
        return RegistryHolder.INSTANCE;
    }
}

