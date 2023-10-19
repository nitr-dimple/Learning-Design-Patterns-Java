package com.neu.dimple.structuraldesignpattern.FacadeDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Email {

    public static EmailBuilder getBulder(){
        return new EmailBuilder();
    }
}
