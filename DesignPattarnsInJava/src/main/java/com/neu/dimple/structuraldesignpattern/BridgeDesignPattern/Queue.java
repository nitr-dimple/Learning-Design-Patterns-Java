package com.neu.dimple.structuraldesignpattern.BridgeDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Queue<T> implements FillCollection<T>{

    private LinkedList<T> list;

    public Queue(LinkedList<T> list){
        this.list = list;
    }

    @Override
    public void offer(T element) {
        list.addLast(element);
    }

    @Override
    public T poll() {
        return list.removeFirst();
    }
}