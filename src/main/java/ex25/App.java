/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */
package ex25;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static String passwordValidator(String Password){
        boolean letters = false, numbers = false, special = false, length = false;
        Set set = new HashSet(Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                '*', '(', ')', '-', '+'));
        if (Password.length() > 7)
            length = true;
        for(char i : Password.toCharArray()){
        if (Character.isLetter(i))
            letters = true;
        if (Character.isDigit(i))
            numbers = true;
        if (set.contains(i))
            special = true;
        }
        if(length & special & numbers & letters){
            return "very strong";
        }
        else if(length & numbers & letters){
            return "strong";
        }
        else if (letters){
            return "weak";
        }
        return "very weak";
    }
    public static void main(String [] args){
        Scanner uInput = new Scanner(System.in);
        System.out.println("Enter your password");
        String Password = uInput.nextLine();
        String Strength = passwordValidator(Password);
        System.out.println("The password "+Password+" is a "+Strength+" password." );
    }
}
