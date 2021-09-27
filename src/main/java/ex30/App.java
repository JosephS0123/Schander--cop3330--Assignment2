/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex30;

import java.util.Scanner;

public class App {

    public static boolean table(boolean bool){
        if (bool){
            int num1;
            int num2;
            for (num1 = 1; num1 <= 12; ++num1)
            {
                for (num2 = 1; num2 <= 12; ++num2)
                {
                    System.out.printf("%4d",num1 * num2);
                }
                System.out.println();
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        table(true);

    }
}
