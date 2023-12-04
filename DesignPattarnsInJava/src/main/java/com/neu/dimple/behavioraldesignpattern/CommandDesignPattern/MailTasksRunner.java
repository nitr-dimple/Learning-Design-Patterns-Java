package com.neu.dimple.behavioraldesignpattern.CommandDesignPattern;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class MailTasksRunner implements Runnable{

    private Thread runner;
    private List<Command> pendingCommand;
    private volatile  boolean stop;
    private static final MailTasksRunner RUNNER = new MailTasksRunner();

    public static final MailTasksRunner getInstance(){
        return RUNNER;
    }

    private MailTasksRunner(){
        pendingCommand = new LinkedList<>();
        runner = new Thread(this);
        runner.start();
    }

    @Override
    public void run() {
        while(true){
            Command cmd = null;
            synchronized (pendingCommand){
                if(pendingCommand.isEmpty()){
                    try{
                        pendingCommand.wait();
                    }catch (InterruptedException e){
                        System.out.println("Runner interrupted");
                        if(stop){
                            System.out.println("Runner stopping");
                            return;
                        }
                    }
                }else{
                    cmd = pendingCommand.remove(0);
                }
            }
            if(cmd == null) return;
            cmd.execute();
        }
    }

    public void addCommand(Command cmd){
        synchronized (pendingCommand){
            pendingCommand.add(cmd);
            pendingCommand.notifyAll();
        }
    }

    public void shutdown(){
        this.stop = true;
        this.runner.interrupt();
    }
}
