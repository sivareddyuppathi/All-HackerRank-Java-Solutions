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
public class _1DArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        for (int j = 0; j < n; j++) {
            a[j] = scan.nextInt();
        }

    }
}
