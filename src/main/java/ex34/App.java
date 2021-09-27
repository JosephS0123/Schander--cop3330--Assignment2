/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ArrayList<String> remover(ArrayList<String> names,String name) {
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals(name)){
                names.remove(i);
            }
        }
        return names;
    }
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        System.out.println("There are "+names.size()+" employees:");
        for(int i = 0; i < names.size();i++){
            System.out.println(names.get(i));
        }
        System.out.println("Enter a name to remove.");
        String name = uInput.nextLine();
        remover(names,name);
        System.out.println("There are "+names.size()+" employees:");
        for(int i = 0; i < names.size();i++){
            System.out.println(names.get(i));
        }

    }

}
