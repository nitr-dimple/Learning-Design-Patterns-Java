package com.neu.dimple.structuraldesignpattern.AdapterDesignPattern.class_adapter;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Client {

    public static void main(String[] args) {
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();

        String card = designer.designCard(adapter);
        System.out.println(card);
    }

    private static void populateEmployeeData(Employee employee){
        employee.setFullName("Elliot Alderson");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("Allsafe Cybersecurity, New York");
    }
}
