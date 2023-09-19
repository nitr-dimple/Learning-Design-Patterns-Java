package com.neu.dimple.structuraldesignpattern.AdapterDesignPattern.object_adapter;

import com.neu.dimple.structuraldesignpattern.AdapterDesignPattern.class_adapter.Customer;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class BusinessCardDesigner {

    public String designCard(Customer customer){
        String card = "";
        card += customer.getName();
        card += "\n" + customer.getDesignation();
        card += "\n" + customer.getAddress();
        return card;
    }
}
