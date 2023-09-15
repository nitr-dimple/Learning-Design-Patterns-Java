package com.neu.dimple.creationaldesignpatterns.SingletonDesignPattern.LazySingleton;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL(){

    }

    // volatile forces value read/write from main memory instead of cache
    private static volatile LazyRegistryWithDCL INSTANCE;  // In case of multiple threading, thread may used cached object which may always reutrn null, in order to avoid this, we use volatile

    public static LazyRegistryWithDCL getInstance(){
        if(INSTANCE == null){
            // We need to handle synchronization (In case of multithreading)
            synchronized (LazyRegistryWithDCL.class){
                if(INSTANCE == null){
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }
}
