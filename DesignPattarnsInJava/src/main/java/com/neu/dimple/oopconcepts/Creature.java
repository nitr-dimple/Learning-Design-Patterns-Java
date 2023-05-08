package com.neu.dimple.oopconcepts;

/**
 * @author Dimpleben Kanjibhai Patel
 */
abstract public class Creature {
    protected String name;
    protected double weight;
    protected String sound;

    public abstract void setName(String newName);
    public abstract String getName();

    public abstract void setWeight(double newWeight);
    public abstract double getWeight();

}
