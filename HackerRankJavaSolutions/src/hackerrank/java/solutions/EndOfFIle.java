/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.java.solutions;

import java.util.Scanner;

/**
 *
 * @author SivaReddy Uppathi
 */
public class EndOfFIle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; scan.hasNext() == true; i++) {
            System.out.println(i + " " + scan.nextLine());
        }
    }
}
