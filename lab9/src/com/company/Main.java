package com.company;

import watki.Thread1;
import watki.Thread2;

import static java.lang.Thread.sleep;

public class Main {


    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Value value = new Value();

        new Thread1(value).start();

        new Thread2(value).start();
      //  new Thread1(value).start();
       // new Thread2(value).start();


//        new Thread2(value).start();
    }
}
