package ex36Test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    public void Test() {
        ArrayList numbers = new ArrayList<String>();
        numbers.add("100");
        numbers.add("200");
        numbers.add("300");
        numbers.add("1000");
       assertEquals(100,ex36.App.min(numbers));
       assertEquals(1000,ex36.App.max(numbers));
       assertEquals(400,ex36.App.average(numbers));
       assertEquals("353.55",ex36.App.stdDev(numbers));
    }
}