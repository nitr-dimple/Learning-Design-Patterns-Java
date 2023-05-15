package com.neu.dimple.strategy_design_pattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class AnimalPlay {

    public static void main(String args[]){
        Animal sparky = new Dog();
        Animal tweety = new Bird();
        System.out.println("sparky fly: " + sparky.tryToFly());
        System.out.println("tweety fly: " +tweety.tryToFly());
    }
}
