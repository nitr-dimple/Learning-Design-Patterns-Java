package com.neu.dimple.structuraldesignpattern.BridgeDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 * This is the abstraction
 * It represents a First in First out Collection
 */
public interface FifoCollection<T> {

    // Add Element to collection
    void offer(T element);

    // Remove and return first element from collection
    T poll();
}
