package com.neu.dimple.creationaldesignpatterns.AbstractFactoryDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class GoogleCloudStorage implements Storage{

    public GoogleCloudStorage(int capacityInMib){
        System.out.println("Allcated " + capacityInMib + " on Google Cloud Storage");
    }


    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public String toString(){
        return "Google Cloud Storage";
    }
}
