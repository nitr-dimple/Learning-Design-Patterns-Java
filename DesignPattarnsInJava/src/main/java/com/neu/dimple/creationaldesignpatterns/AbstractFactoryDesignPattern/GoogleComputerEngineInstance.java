package com.neu.dimple.creationaldesignpatterns.AbstractFactoryDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class GoogleComputerEngineInstance implements Instance{

    public GoogleComputerEngineInstance(Capacity capacity){
        System.out.println("Created Google Computer Engine Instance");
    }


    @Override
    public void start() {
        System.out.println("Google Computer Engine Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to  Google Computer Engine Instance");
    }

    @Override
    public void stop() {
        System.out.println(" Google Computer Engine Instance stoppped");
    }

    @Override
    public String toString(){
        return "Google Computer Engine Instance";
    }
}
