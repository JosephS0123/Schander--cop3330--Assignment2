/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Schander
 */

package ex24Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class AppTest
{
    @Test
  public void test(){
        assertTrue(ex24.App.IsAnagram("Rat","Tar")); // tests if method works will be true if it is an anagram.
        assertFalse(ex24.App.IsAnagram("Joseph","Gramps")); //tests if method works will be false since isnt anagram.
    }
}
