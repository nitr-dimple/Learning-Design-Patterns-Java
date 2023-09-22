package com.neu.dimple.structuraldesignpattern.BridgeDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Client {

    public static void main(String[] args) {
        FillCollection<Integer> collection = new Queue<>(new SingleLinkedList<>());
        collection.offer(10);
        collection.offer(20);
        collection.offer(30);

        System.out.println(collection.poll());
    }
}
