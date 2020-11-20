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
public class StaticIntilizerBlock {

    static boolean flag = true;
    static int B, H;

    static {
        Scanner sc = new Scanner(System.in);

        B = sc.nextInt();
        H = sc.nextInt();
        boolean flag = true;
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
            System.exit(0);
        }

    }
}
