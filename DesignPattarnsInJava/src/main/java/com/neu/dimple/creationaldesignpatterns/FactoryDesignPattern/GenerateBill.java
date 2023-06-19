package com.neu.dimple.creationaldesignpatterns.FactoryDesignPattern;

import java.util.Scanner;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class GenerateBill {

    public static void main(String args[]){

        PlanFactory planFactory = new PlanFactory();

        System.out.print("Enter any one plan to generate bill: \n" +
                "Domestic \n" +
                "Commercial \n" +
                "Institutional \n\n");
        Scanner sc = new Scanner(System.in);
        String planType = sc.nextLine();

        Plan plan = planFactory.getPlan(planType);

        if(plan != null){
            plan.getRate();
            System.out.println("Rate of plan " + planType + " : " + plan.rate);
            plan.calculateBill(10);
        }
        else{
            System.out.println("Please enter correct Plan Type");
        }


    }
}
