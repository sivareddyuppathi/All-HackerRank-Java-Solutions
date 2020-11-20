/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.java.solutions;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author SivaReddy Uppathi
 */
public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s.trim();
        StringTokenizer st = new StringTokenizer(s, ("[_\\@!?.', ]"));
        int x = st.countTokens();
        System.out.println(x);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        scan.close();
    }
}
