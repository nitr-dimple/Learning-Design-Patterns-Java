package com.neu.dimple.behavioraldesignpattern.StrategyDesignPattern;


import java.util.LinkedList;

/**
 * @author Dimpleben Kanjibhai Patel
 */

//Context
public class PrintService {

    private OrderPrinter printer;

    public PrintService(OrderPrinter printer){
        this.printer = printer;
    }

    public void printOrders(LinkedList<Order> orders){
        printer.print(orders);
    }
}
