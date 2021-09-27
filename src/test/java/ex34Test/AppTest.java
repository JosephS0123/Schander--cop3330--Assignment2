/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex34Test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    public void Test() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("John Smith");
        names2.add("Jackie Jackson");
        names2.add("Chris Jones");
        names2.add("Amanda Cullen");
        assertEquals(names2,ex34.App.remover(names,"Jeremy Goodwin"));

    }
}