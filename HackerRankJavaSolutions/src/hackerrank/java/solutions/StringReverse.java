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
public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(A.equals(new StringBuilder(A).reverse().toString())
                ? "Yes" : "No");
    }
}
