package com.neu.dimple.strategy_design_pattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Dog extends Animal {
    public void digHole(){
        System.out.println("Dug a hole");
    }

    public Dog(){
        super();
        setSound("Bark");
        flyingType = new CantFlys();

    }
}
