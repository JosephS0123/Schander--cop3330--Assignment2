/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex33;

import java.util.Scanner;

public class App {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static String ball(){
        int rand = getRandomNumber(1,5);
        if(rand == 1){
            return "Yes.";
        }
        else if(rand == 2){
            return "No.";
        }
        else if(rand == 3){
            return"Maybe.";
        }
        else if(rand == 4){
            return "Ask again later.";
        }
            return "what?";

    }
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        System.out.println("What is your question?");
        String question = uInput.nextLine();
        System.out.println(ball());

    }
}
