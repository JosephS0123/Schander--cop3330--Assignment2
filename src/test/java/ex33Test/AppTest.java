/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */
package ex33Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    public void Test() {
        assertEquals("Yes.",ex33.App.ball()); // this will say fail if it gives anything other than yes but it still shows that the output is random and working.
    }
}