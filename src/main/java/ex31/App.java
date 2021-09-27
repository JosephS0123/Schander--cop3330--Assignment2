/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex31;
import java.util.Scanner;

public class App {
    public static boolean heart(int resting, int age) {
        double target;
        int bpm,intensityprint;
        System.out.format("%s%2d%12s%2d","Resting Pulse:",resting,"Age:",age);
        System.out.println();
        System.out.format("%s%12s\n","Intensity","| Rate");
        System.out.println("---------------|----------");

        for (double intensity = .55; intensity <= .96; intensity += .05) {
            target = Math.round((((220 - age) - resting) * intensity) + resting);
            bpm = (int)target;
            intensityprint =(int)(intensity*100);
            System.out.format("%d%s%13s%d%3s\n",intensityprint,"%","|",bpm,"  bpm");
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        int a = 0;
        while (true) {
            System.out.println("Enter your resting heart rate.");
            String b = uInput.nextLine();
            if(b.matches("\\d+")) {
                a = Integer.parseInt(b);
                break;
            }
            System.out.println("Sorry that is not a valid input.");
        }
        int c = 0;
        while (true) {
            System.out.println("Enter your age.");
            String d = uInput.nextLine();
            if(d.matches("\\d+")) {
                c = Integer.parseInt(d);
                break;
            }
            else
            System.out.println("Sorry that is not a valid input.");
        }
        heart(a,c);
    }
}
