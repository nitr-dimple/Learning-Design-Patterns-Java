package com.neu.dimple.structuraldesignpattern.FacadeDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class OrderEmailTemplate extends Template{
    @Override
    public String format(Object object) {
        return "Template";
    }
}
