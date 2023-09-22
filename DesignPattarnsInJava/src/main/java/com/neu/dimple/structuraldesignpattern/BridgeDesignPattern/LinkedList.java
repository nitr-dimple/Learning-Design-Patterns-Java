package com.neu.dimple.structuraldesignpattern.BridgeDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 * This is the implementor
 * As implementor is defining its own hierarchy which not related at all to the abstraction hierarchy
 */
public interface LinkedList<T> {

    void addFirst(T element);

    T removeFirst();

    void addLast(T element);

    T removeLast();

    int getSize();
}
