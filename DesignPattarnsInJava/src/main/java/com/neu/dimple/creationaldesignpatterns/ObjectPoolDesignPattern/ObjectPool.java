package com.neu.dimple.creationaldesignpatterns.ObjectPoolDesignPattern;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Supplier;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class ObjectPool<T extends Poolable>{

    private BlockingDeque<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count) {
        availablePool = new LinkedBlockingDeque<>();
        for(int i=0; i<count; i++)
            availablePool.offer(creator.get());
    }

    public T get(){
        try{
            return availablePool.take();
        }catch (InterruptedException ex){
            System.err.println("take() was interrrupted");
        }
        return null;
    }

    public void release(T obj){
        obj.reset();
        try{
            availablePool.put(obj);
        }catch (InterruptedException ex){
            System.err.println("put() was interrrupted");
        }
    }
}
