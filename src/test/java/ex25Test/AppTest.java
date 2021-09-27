package ex25Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AppTest {
    @Test
    public void test(){
        assertEquals("very weak",ex25.App.passwordValidator("123456"));
        assertEquals("weak",ex25.App.passwordValidator("Joseph"));
        assertEquals("strong",ex25.App.passwordValidator("johnny123"));
        assertEquals("very strong",ex25.App.passwordValidator("ff33Jonesy123!"));
    }
}
