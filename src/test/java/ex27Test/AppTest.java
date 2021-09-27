package ex27Test;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    public void Test(){

        assertTrue(ex27.App.FirstNameVal1("Joseph"));
        assertTrue(ex27.App.FirstNameVal2("Joseph"));
        assertTrue(ex27.App.LastNameVal1("Schander"));
        assertTrue(ex27.App.LastNameVal2("Schander"));
        assertTrue(ex27.App.ZIPVal("12345"));
        assertTrue(ex27.App.IDVal("AA-1234"));
    }
}
