package nhannguyenh.test.leetcode.easy;

import nhannguyenh.leetcode.easy.FibonacciNumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciNumberTest {
    private FibonacciNumber solution;

    @BeforeEach
    public void setup() {
        solution = new FibonacciNumber();
    }

    @AfterEach
    public void tearDown() {
        solution = null;
    }

    @Test
    void givenInputLessThan0_shouldReturnMinus1() {
        assertEquals(-1, solution.fib(-1));
    }

    @Test
    void givenInputGreaterThan30_shouldReturnMinus1() {
        assertEquals(-1, solution.fib(31));
    }

    @Test
    void givenInputEqualTo0_shouldReturn0() {
        assertEquals(0, solution.fib(0));
    }

    @Test
    void givenInputEqualTo1_shouldReturn1() {
        assertEquals(1, solution.fib(1));
    }

    @Test
    void givenInputEqualTo2_shouldReturn1() {
        assertEquals(1, solution.fib(2));
    }

    @Test
    void givenInputEqualTo3_shouldReturn2() {
        assertEquals(2, solution.fib(3));
    }

    @Test
    void givenInputEqualTo4_shouldReturn3() {
        assertEquals(3, solution.fib(4));
    }

    @Test
    void givenInputEqualTo5_shouldReturn5() {
        assertEquals(5, solution.fib(5));
    }

    @Test
    void givenInputEqualTo6_shouldReturn8() {
        assertEquals(8, solution.fib(6));
    }

    @Test
    void givenInputEqualTo7_shouldReturn13() {
        assertEquals(13, solution.fib(7));
    }

    @Test
    void givenInputEqualTo8_shouldReturn21() {
        assertEquals(21, solution.fib(8));
    }

    @Test
    void givenInputEqualTo9_shouldReturn34() {
        assertEquals(34, solution.fib(9));
    }

    @Test
    void givenInputEqualTo10_shouldReturn55() {
        assertEquals(55, solution.fib(10));
    }
}
