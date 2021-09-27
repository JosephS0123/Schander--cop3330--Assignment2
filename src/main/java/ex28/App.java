/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex28;

import java.util.Scanner;

public class App {
    public static int Add5(int a,int b,int c,int d,int e){
        Scanner uInput = new Scanner(System.in);
        if( a+b+c+d+e!= 0){
            return a+b+c+d+e;
        }
        int i = 0;
        int Total = 0;
        while ( i < 5){
            System.out.println("Please enter a number.");
            Total += uInput.nextInt();
            i++;
        }
        return Total;
    }
    public static void main(String [] args) {
        System.out.println("The total is: "+Add5(0,0,0,0,0));;
    }
}
