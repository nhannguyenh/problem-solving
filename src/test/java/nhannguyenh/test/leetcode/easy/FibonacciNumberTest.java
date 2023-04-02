package nhannguyenh.test.leetcode.easy;

import nhannguyenh.leetcode.easy.FibonacciNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FibonacciNumberTest {
    private FibonacciNumber solution;

    @Before
    public void setup() {
        solution = new FibonacciNumber();
    }

    @After
    public void tearDown() {
        solution = null;
    }

    @Test
    public void inputLessThan0() {
        assertEquals(-1, solution.fib(-1));
    }

    @Test
    public void inputGreaterThan30() {
        assertEquals(-1, solution.fib(31));
    }

    @Test
    public void inputEqualTo0() {
        assertEquals(0, solution.fib(0));
    }

    @Test
    public void inputEqualTo1() {
        assertEquals(1, solution.fib(1));
    }

    @Test
    public void inputEqualTo2() {
        assertEquals(1, solution.fib(2));
    }

    @Test
    public void inputEqualTo3() {
        assertEquals(2, solution.fib(3));
    }

    @Test
    public void inputEqualTo4() {
        assertEquals(3, solution.fib(4));
    }

    @Test
    public void inputEqualTo5() {
        assertEquals(5, solution.fib(5));
    }

    @Test
    public void inputEqualTo6() {
        assertEquals(8, solution.fib(6));
    }

    @Test
    public void inputEqualTo7() {
        assertEquals(13, solution.fib(7));
    }

    @Test
    public void inputEqualTo8() {
        assertEquals(21, solution.fib(8));
    }

    @Test
    public void inputEqualTo9() {
        assertEquals(34, solution.fib(9));
    }

    @Test
    public void inputEqualTo10() {
        assertEquals(55, solution.fib(10));
    }
}
