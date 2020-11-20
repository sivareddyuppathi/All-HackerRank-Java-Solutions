/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.java.solutions;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author SivaReddy Uppathi
 */
public class PrimarlyTest {

    // private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");

    }
}
