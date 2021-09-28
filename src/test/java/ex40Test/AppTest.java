/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex40Test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    public void Test() {
        ArrayList<HashMap<String, String>> list = new ArrayList<>();
        HashMap<String, String> John = new HashMap<>();
        John.put("Name", "John Johnson");
        John.put("Position", "Manager");
        John.put("Separation date", "2016-12-31");
        list.add(John);
        HashMap<String, String> Jake = new HashMap<String, String>();
        Jake.put("Name", "Jake Jacobson");
        Jake.put("Position", "Programmer");
        Jake.put("Separation date", " ");
        list.add(Jake);
        HashMap<String, String> Jacquelyn = new HashMap<>();
        Jacquelyn.put("Name", "Jacquelyn Jackson ");
        Jacquelyn.put("Position", "DBA");
        Jacquelyn.put("Separation date", " ");
        list.add(Jacquelyn);
        HashMap<String, String> Michaela = new HashMap<String, String>();
        Michaela.put("Name", "Michaela Michaelson");
        Michaela.put("Position", "District manager");
        Michaela.put("Separation date", "2015-12-19");
        list.add(Michaela);
        HashMap<String, String> Sally = new HashMap<>();
        Sally.put("Name", "Sally Weber");
        Sally.put("Position", "Web Developer");
        Sally.put("Separation date", "2015-12-18");
        list.add(Sally);
        HashMap<String, String> Tou = new HashMap<>();
        Tou.put("Name", "Tou Xiong");
        Tou.put("Position", "Software Engineer");
        Tou.put("Separation date", "2016-10-05");
        list.add(Tou);
        ArrayList<HashMap<String, String>> list2 = new ArrayList<>();
        list2.add(Jake);
        list2.add(Jacquelyn);
        assertEquals(list2,ex40.App.search(list,"Jac")); // searches everything, isnt sorted though so add to list 2 in same order
    }

}