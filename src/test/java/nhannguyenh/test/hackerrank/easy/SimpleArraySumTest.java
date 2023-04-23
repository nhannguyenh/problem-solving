package nhannguyenh.test.hackerrank.easy;

import nhannguyenh.hackerrank.easy.SimpleArraySum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class SimpleArraySumTest {
    private SimpleArraySum solution;

    @Before
    public void setup() {
        solution = new SimpleArraySum();
    }

    @After
    public void tearDown() {
        solution = null;
    }

    @Test
    public void testCase1() {
        assertEquals(31, solution.simpleArraySum(List.of(1, 2, 3, 4, 10, 11)));
    }

    @Test
    public void testCase2() {
        assertEquals(20, solution.simpleArraySum(List.of(1, 1, 2, 3, 5, 8)));
    }
}
