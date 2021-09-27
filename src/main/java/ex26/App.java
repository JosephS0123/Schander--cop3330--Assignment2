/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex26;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.log;

public class App {
    public static class PaymentCalculator{
        public static int calculateMonthsUntilPaidOff(double b,double i, double p){
            i = i/100;
            i = i/365;
            double n = Math.ceil((-0.03333333333) * log(1 + (b/p) * (1 - java.lang.Math.pow(1+i,30)))/log(1+i));
            return (int) n;
        }
    }

    public static void main(String [] args) {

        Scanner uInput = new Scanner(System.in);
        System.out.println("What is your balance?");
        double Balance = uInput.nextDouble();
        System.out.println("What is the percent apr on this account?");
        double APR = uInput.nextDouble();
        System.out.println("What is the monthly payment you can make?");
        double MonthlyPay = uInput.nextDouble();
        int Months = PaymentCalculator.calculateMonthsUntilPaidOff(Balance,APR,MonthlyPay);
        System.out.println("It will take you " + Months + " months to pay off this card.");
    }
}
