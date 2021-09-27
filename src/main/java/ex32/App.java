/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex32;

import java.util.Scanner;


public class App {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void game(int diff) {
        Scanner uInput = new Scanner(System.in);
        int rand = 0;
        int totalGuesses = 0;
        int uGuess = 0;
        if(diff == 1){
            rand = getRandomNumber(1,11);
        }
        else if (diff == 2){
            rand = getRandomNumber(1,101);
        }
        else if (diff == 3){
            rand = getRandomNumber(1,1001);
        }
        System.out.println("Ok, i have my number, take your guess!");
        while (uGuess != rand){
            String guess = uInput.nextLine();
            if(guess.matches("\\d+" )) {
                uGuess = Integer.parseInt(guess);
            }
            totalGuesses++;
            if(uGuess>rand){
                System.out.println("Too high! Guess again.");
            }
            else if(uGuess<rand && uGuess != 0){
                System.out.println("Too low! Guess again.");
            }
            else if (uGuess == 0){
                System.out.println("Wrong input! I'm still adding a guess to your total!");
            }
        }
        System.out.println("Congrats! You got the number in "+totalGuesses+" guesses!");

    }
    public static boolean yn(){
        Scanner uInput = new Scanner(System.in);
        String yn;
        System.out.println("Do you wish to play again (Y/N)?");
        yn = uInput.nextLine();
        return yn.equals("y") || yn.equals("Y");
    }
        public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        int diff = 0;
        String conf;
        boolean yn = true;
        while (yn) {
            while(diff == 0){
                System.out.println("Enter the difficulty level (1,2 or 3)");
                conf = uInput.nextLine();
                if(conf.matches("\\d+") && Integer.parseInt(conf)<4){
                    diff = Integer.parseInt(conf);
                }
            }
            System.out.println();
            game(diff);
            yn = yn();

        }
    }
}
