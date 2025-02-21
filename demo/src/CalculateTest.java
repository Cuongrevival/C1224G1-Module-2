import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateTest {
    @Test
    public void testAdd(){
        int x = 1;
        int y = 2;
        int result = Calculate.add(x, y);
        int expected = 2;
        assertEquals(expected, result);
    }
}
