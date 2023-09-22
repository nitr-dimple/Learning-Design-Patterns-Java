package com.neu.dimple.structuraldesignpattern.DecoratorDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class TextMessage implements Message{

    private String msg;

    public TextMessage(String msg){
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return this.msg;
    }
}
