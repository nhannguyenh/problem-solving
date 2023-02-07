package nhannguyenh.test.hackerrank.easy;

import nhannguyenh.hackerrank.easy.SolveMeFirst;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolveMeFirstTest {
    private SolveMeFirst solution;

    @Before
    public void setup() {
        solution = new SolveMeFirst();
    }

    @After
    public void tearDown() {
        solution = null;
    }

    @Test
    public void sumOfNumber2AndNumber3() {
        assertEquals(5, solution.sum(2, 3));
    }

    @Test
    public void sumOfNumber100AndNumber1000() {
        assertEquals(1100, solution.sum(100, 1000));
    }
}
