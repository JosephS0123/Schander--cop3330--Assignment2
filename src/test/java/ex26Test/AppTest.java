/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex26Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    public void Test(){
        assertEquals(70,ex26.App.PaymentCalculator.calculateMonthsUntilPaidOff(5000,12,100));
    }
}
