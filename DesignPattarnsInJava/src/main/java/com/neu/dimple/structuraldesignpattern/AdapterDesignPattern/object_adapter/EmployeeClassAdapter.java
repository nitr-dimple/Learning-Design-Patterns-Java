package com.neu.dimple.structuraldesignpattern.AdapterDesignPattern.object_adapter;

import com.neu.dimple.structuraldesignpattern.AdapterDesignPattern.class_adapter.Customer;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class EmployeeClassAdapter implements Customer {
    private Employee adaptee;

    public EmployeeClassAdapter(Employee employee){
        this.adaptee = employee;
    }

    @Override
    public String getName() {
        return this.adaptee.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.adaptee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.adaptee.getFullName();
    }
}
