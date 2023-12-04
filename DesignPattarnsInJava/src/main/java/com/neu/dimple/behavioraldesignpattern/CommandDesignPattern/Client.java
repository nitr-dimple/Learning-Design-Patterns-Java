package com.neu.dimple.behavioraldesignpattern.CommandDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {

        EWSService service = new EWSService();
        Command command = new AddMemberCommand("a@example.com", "spam", service);

        MailTasksRunner.getInstance().addCommand(command);

        Command command1 = new AddMemberCommand("b@example.com", "spam", service);
        MailTasksRunner.getInstance().addCommand(command1);


        Thread.sleep(3000);
        MailTasksRunner.getInstance().shutdown();

    }
}
