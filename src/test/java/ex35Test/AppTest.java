/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex35Test;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    public void Test() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Maggy");
        assertEquals("Maggy",ex35.App.Winner(names));

    }
}