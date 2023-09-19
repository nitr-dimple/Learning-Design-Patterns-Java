package com.neu.dimple.structuraldesignpattern.AdapterDesignPattern.class_adapter;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class EmployeeClassAdapter extends Employee implements Customer{

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
