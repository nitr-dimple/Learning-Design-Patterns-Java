package com.neu.dimple.behavioraldesignpattern.StrategyDesignPattern;

import java.util.Collection;

/**
 * @author Dimpleben Kanjibhai Patel
 */

//Strategy
public interface OrderPrinter {

    void print(Collection<Order> orders);
}
