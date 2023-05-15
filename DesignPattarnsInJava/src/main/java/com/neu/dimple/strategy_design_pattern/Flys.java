package com.neu.dimple.strategy_design_pattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public interface Flys {

    String fly();
}

class ItFlys implements Flys{

    public String fly() {
        return "Flying High";
    }
}

class CantFlys implements Flys{

    public String fly() {
        return "I Can't fly";
    }
}
