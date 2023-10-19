package com.neu.dimple.structuraldesignpattern.FacadeDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public abstract class Template {

    public enum TemplateType{Email, NewsLetter};

    public abstract String format(Object object);
}
