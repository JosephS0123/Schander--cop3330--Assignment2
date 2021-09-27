/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex29;

import java.util.Scanner;

public class App {
public static int func(int a){
    return 72/a;
}
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        int a = 0;
        while (true) {
            System.out.println("What is the rate of return.");
            String b = uInput.nextLine();
            if(b.matches("\\d+")) {
                a = Integer.parseInt(b);
                if (a != 0) {
                    System.out.println("It will take you " + func(a) + " years to double your initial investment.");
                    break;
                }
            }
            else
            System.out.println("Sorry that is not a valid input.");
            }
        }
    }
