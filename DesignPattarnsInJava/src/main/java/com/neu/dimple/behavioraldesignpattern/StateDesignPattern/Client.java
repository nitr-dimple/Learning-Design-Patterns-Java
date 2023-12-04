package com.neu.dimple.behavioraldesignpattern.StateDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Client {
    public static void main(String[] args) {
        Order order = new Order();

        order.paymentSuccessful();
        order.dispatched();

        order.cancel();
    }
}
