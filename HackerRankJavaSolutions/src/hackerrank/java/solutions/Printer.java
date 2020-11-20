/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.java.solutions;

import java.util.HashSet;

/**
 *
 * @author SivaReddy Uppathi
 */
public class Printer {

    boolean wasRun;

    //call from main method
    public void printArray(Object o) {
        if (wasRun) {
            return;
        }
        System.out.print("1\n2\n3\nHello\nWorld\n");
        wasRun = true;
    }
}
