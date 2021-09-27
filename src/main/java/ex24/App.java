
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex24;


import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App
{
   public static Boolean IsAnagram(String Word1,String Word2) {
        if(Word1.length() != Word2.length()){
            return false;
        }
        else{
            char[] Arr1 = Word1.toLowerCase(Locale.ROOT).toCharArray();
            char[] Arr2 = Word2.toLowerCase(Locale.ROOT).toCharArray();
            Arrays.sort(Arr1);
            Arrays.sort(Arr2);
            return Arrays.equals(Arr1,Arr2);
        }
    }
    public static void main( String[] args )
    {
        Scanner uInput = new Scanner(System.in);
        System.out.println("Please enter the first word");
        String Word1 = uInput.nextLine();
        System.out.println("Please enter the second word");
        String Word2 = uInput.nextLine();
        if (IsAnagram(Word1,Word2)){
            System.out.println(Word1+" and "+ Word2 + " are anagrams.");
        }
        else{
            System.out.println(Word1+ " and "+ Word2 + " are not anagrams.");
        }
    }
}
