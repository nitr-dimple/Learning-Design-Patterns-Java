package com.neu.dimple.creationaldesignpatterns.FactoryDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class PlanFactory {

    public Plan getPlan(String planType){
        if(planType == null) return null;
        if(planType.equalsIgnoreCase("domestic"))
            return new DomesticPlan();
        else if(planType.equalsIgnoreCase("commercial"))
            return new CommercialPlan();
        else if(planType.equalsIgnoreCase("institutional"))
            return new InstitutionalPlan();
        else
            return null;
    }
}
