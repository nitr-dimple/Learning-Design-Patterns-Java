package com.neu.dimple.structuraldesignpattern.DecoratorDesignPattern;

import org.apache.commons.text.StringEscapeUtils;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class HTMLEncodedMessage implements Message{

    private Message msg;

    public HTMLEncodedMessage(Message msg){
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4( msg.getContent());
    }
}
