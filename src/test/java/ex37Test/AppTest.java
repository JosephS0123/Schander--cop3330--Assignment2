package ex37Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    public void Test() {
        assertNotEquals(ex37.App.randPass(8,2,2),ex37.App.randPass(8,2,2));
        // should almost never return the same thing, insane luck if it does.
    }
}