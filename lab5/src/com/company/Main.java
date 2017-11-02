package com.company;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//checking if this easy robot works in an app, but its not
//it is working on windows and in easy apps like notepad

public class Main{
    public static void main(String [] args){
        final ScheduledExecutorService schedule = Executors.newScheduledThreadPool(1);
        schedule.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try{
                    Robot robot=new Robot();
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.keyRelease(KeyEvent.VK_Z);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        },1,1, TimeUnit.SECONDS);
    }
}