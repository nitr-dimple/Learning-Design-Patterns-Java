package com.neu.dimple.structuraldesignpattern.FlyWeightDesignPattern;


/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Client {

    public static void main(String[] args) {
        SystemErrorMessage message1 = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.GenericSystemError);
        System.out.println(message1.getText("4056"));

        UserBannedErrorMessage message2 = ErrorMessageFactory.getInstance().getUserBannedErrorMessage("1202");
        System.out.println(message2.getText(null));
    }
}
