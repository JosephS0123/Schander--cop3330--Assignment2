/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex27;

import java.util.Scanner;

public class App {
   public static boolean FirstNameVal1(String First){
       return First.length() >= 1;
    }
    public static boolean FirstNameVal2(String First){
        return First.length() >= 2;
    }
    public static boolean LastNameVal1(String Last){
        return Last.length() >= 1;
    }
    public static boolean LastNameVal2(String Last){
        return Last.length() >= 2;
    }
    public static boolean ZIPVal(String ZIP){
       if(ZIP.length() != 5){
           return false;
       }
       for(char i: ZIP.toCharArray()){
           if(!Character.isDigit(i)){
               return false;
           }
       }
       return true;
    }
    public static boolean IDVal(String ID){
       char a = '-';
       if(ID.length()>7){
           return false;
       }
        if(!Character.isLetter(ID.charAt(0))){
            return false;
        }
        if (!Character.isLetter(ID.charAt(1))){
            return false;
        }
        if (Character.compare(ID.charAt(2),a) != 0){
            return false;
    }
        if (!Character.isDigit(ID.charAt(3))){
            return false;
        }
        if (!Character.isDigit(ID.charAt(4))){
            return false;
        }
        if (!Character.isDigit(ID.charAt(5))){
            return false;
        }
        return Character.isDigit(ID.charAt(6));
    }
   public static void validateInput(String First,String Last, String ZIP,String ID){
       if(!FirstNameVal2(First)){
           System.out.println("The first name must be at least 2 characters.");
       }
       if(!FirstNameVal1(First)){
           System.out.println("The first name must be filled in.");
       }
       if(!LastNameVal2(Last)){
           System.out.println("The last name must be at least 2 characters.");
       }
       if(!LastNameVal1(Last)){
           System.out.println("The last name must be filled in.");
       }
       if(!IDVal(ID)){
           System.out.println("The ID must be in format AA-1234.");
       }
       if (!ZIPVal(ZIP)){
           System.out.println("The ZIP code must be a 5 digit number.");
       }

   }
    public static void main(String [] args) {

        Scanner uInput = new Scanner(System.in);
        System.out.println("Enter the first name.");
        String Name1 = uInput.nextLine();
        System.out.println("Enter the last name.");
        String Name2 = uInput.nextLine();
        System.out.println("Enter the ZIP code.");
        String ZIP = uInput.nextLine();
        System.out.println("Enter the employee ID.");
        String ID = uInput.nextLine();
        validateInput(Name1,Name2,ZIP,ID);
    }
}
