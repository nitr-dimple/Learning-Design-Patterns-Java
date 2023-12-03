package com.neu.dimple.structuraldesignpattern.ProxyDesignPattern.dynamic;


import java.lang.reflect.Proxy;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class ImageFactory {

    public static Image getImage(String name){
        return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[]{Image.class}, new ImageInvocationHandler(name));

    }
}
