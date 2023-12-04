package com.neu.dimple.behavioraldesignpattern.CommandDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */

// This class is the receiver
public class EWSService {

    public  void addMember(String contact, String contactGroup){
        System.out.println("Added " + contact + " to " + contactGroup);
    }

    public void removeMember(String contact, String contactGroup){
        System.out.println("Removed " + contact + " from " + contactGroup);
    }
}
