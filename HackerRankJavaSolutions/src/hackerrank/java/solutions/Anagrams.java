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
public class Anagrams {

    public static void main(String[] args) {
        isAnagram("anagramm", "marganaa");
    }

    //pass data from main method...........
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int c[] = new int[26], d[] = new int[26];
        a = a.toUpperCase();
        b = b.toUpperCase();
        for (int i = 0; i < a.length(); i++) {
            c[a.charAt(i) - 'A']++;
            d[b.charAt(i) - 'A']++;
        }
        for (int i = 0; i < 26; i++) {
            if (c[i] != d[i]) {
                return false;
            }
        }
        return true;
    }

}
