package com.neu.dimple.creationaldesignpatterns.SingletonDesignPattern.LazySingleton;

import com.neu.dimple.creationaldesignpatterns.SingletonDesignPattern.EagerSingleton.EagerRegistry;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Client {

    public static void main(String[] args) {
        LazyRegistryWithDCL registry = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL registry1 = LazyRegistryWithDCL.getInstance();

        System.out.println(registry == registry1);

        LazyRegistryWithIODH registryWithIODH = LazyRegistryWithIODH.getInstance();
        LazyRegistryWithIODH registryWithIODH1 = LazyRegistryWithIODH.getInstance();

        System.out.println(registryWithIODH == registryWithIODH1);
    }
}
