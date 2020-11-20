/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.java.solutions;

/**
 *
 * @author SivaReddy Uppathi
 */
import java.util.*;

public class IfElse {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N>=2&&N<=5){
            if(N%2==0){
                System.out.println("Not Weird");
            }
            else{
                 System.out.println("Weird");
            }
        }
        if(N>=6&&N<=20){
            if(N%2==0){
                 System.out.println("Weird");
            }
            else{
                 System.out.println("Not Weird");
            }
           
        }
        if(N>20){
            if(N%2==0){
                System.out.println("Not Weird");
            }
            else
             System.out.println("Weird");
        }

        scanner.close();
    }
}

