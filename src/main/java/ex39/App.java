/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex39;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class App {
    public static ArrayList<HashMap<String, String>> sort(ArrayList<HashMap<String, String>> list){
        String[] yuh = new String[list.size()];
        String temp;
        ArrayList<HashMap<String, String>> newList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
          yuh[i] = (list.get(i).get("Name").split(" ")[1]);
        }
        for(int i = 0; i < yuh.length; i++) {
            if (!yuh[i].isEmpty()) {
                for (int j = 0; j < yuh.length; j++) {
                    if (!yuh[j].isEmpty()) {
                        if (yuh[i].toCharArray()[0] <= yuh[j].toCharArray()[0]) {
                            if (yuh[i].toCharArray()[0] == yuh[j].toCharArray()[0]){
                                for(int p = 1 ; p < yuh[i].length();p++){
                                    if (yuh[i].toCharArray()[p] < yuh[j].toCharArray()[p]){
                                        temp = yuh[i];
                                        yuh[i] = yuh[j];
                                        yuh[j] = temp;
                                    }
                                    else if (yuh[i].toCharArray()[p] > yuh[j].toCharArray()[p]){
                                        break;
                                    }
                                }
                            }
                             else {
                                temp = yuh[i];
                                yuh[i] = yuh[j];
                                yuh[j] = temp;
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0; i < yuh.length; i++) {
            if (!yuh[i].isEmpty()) {
                for (int j = 0; j < yuh.length; j++) {
                    if (!yuh[j].isEmpty()) {
                        if (yuh[i].equals( list.get(j).get("Name").split(" ")[1])) {
                            newList.add(list.get(j));
                        }
                    }
                }
            }
        }
        return newList;

    }
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        ArrayList<HashMap<String, String>> list = new ArrayList<>();
        HashMap<String, String> John = new HashMap<>() ;
        John.put("Name","John Johnson");
        John.put("Position","Manager");
        John.put("Separation date","2016-12-31");
        list.add(John);
        HashMap<String, String> Jake = new HashMap<String, String>();
        Jake.put("Name","Jake Jacobson");
        Jake.put("Position","Programmer");
        Jake.put("Separation date"," ");
        list.add(Jake);
        HashMap<String, String> Jacquelyn = new HashMap<>();
        Jacquelyn.put("Name","Jacquelyn Jackson ");
        Jacquelyn.put("Position","DBA");
        Jacquelyn.put("Separation date"," ");
        list.add(Jacquelyn);
        HashMap<String, String> Michaela = new HashMap<String, String>();
        Michaela.put("Name","Michaela Michaelson");
        Michaela.put("Position","District manager");
        Michaela.put("Separation date","2015-12-19");
        list.add(Michaela);
        HashMap<String, String> Sally = new HashMap<>();
        Sally.put("Name","Sally Weber");
        Sally.put("Position","Web Developer");
        Sally.put("Separation date","2015-12-18");
        list.add(Sally);
        HashMap<String, String> Tou = new HashMap<>();
        Tou.put("Name","Tou Xiong");
        Tou.put("Position","Software Engineer");
        Tou.put("Separation date","2016-10-05");
        list.add(Tou);
        ArrayList<HashMap<String, String>> newList = sort(list);
        System.out.format("%s %16s %s%23s%s\n","Name","|","Position","|","Separation Date");
        System.out.format("--------------------|-------------------------------|-----------------\n");
        for (int i = 0; i< newList.size();i++){
            System.out.format("%-19s %-1s %-30s%-2s%5s\n",newList.get(i).get("Name"),"|",newList.get(i).get("Position"),"|",newList.get(i).get("Separation date"));
        }
    }
}
