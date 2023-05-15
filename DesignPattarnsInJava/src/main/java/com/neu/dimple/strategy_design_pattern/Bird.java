package com.neu.dimple.strategy_design_pattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Bird extends Animal{

    public Bird(){
        super();
        setSound("Tweet");
        flyingType = new ItFlys();
    }
}
