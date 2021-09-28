/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex38Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    public void Test() {
        assertEquals("2 4 6 8 10 ",ex38.App.even("1 2 3 4 5 6 7 8 9 10")); // extra space will be placed at the end
    }
}