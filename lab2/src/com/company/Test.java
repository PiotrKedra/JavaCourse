package com.company;
import zad3.*;

import java.util.LinkedList;

import static javafx.application.Platform.exit;

public class Test {

    public static void main(String[] args) {
        TestHelpFunction test = new TestHelpFunction();

        try {
            test.menu();
        }catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

}
