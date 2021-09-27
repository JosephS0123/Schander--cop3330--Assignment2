/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex35;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static int GetRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static String Winner(ArrayList<String> names){
        int rand = GetRandomNumber(0,names.size());
        return names.get(rand);
    }
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        String name;
        ArrayList<String> names = new ArrayList<String>();
        while (true){
            System.out.println("Enter a name.");
            name = uInput.nextLine();
            if(name.isBlank()){
                break;
            }
            else names.add(name);
        }
       System.out.println("The winner is..."+Winner(names));
    }
}
