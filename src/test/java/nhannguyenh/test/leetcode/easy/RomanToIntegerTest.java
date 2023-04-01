package nhannguyenh.test.leetcode.easy;

import nhannguyenh.leetcode.easy.RomanToInteger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class RomanToIntegerTest {
    private RomanToInteger solution;

    @Before
    public void setup() {
        solution = new RomanToInteger();
    }

    @After
    public void tearDown() {
        solution = null;
    }

    @Test
    public void inputLengthEqual0() {
        assertFalse(solution.isValidInput(""));
    }

    @Test
    public void inputLengthGreaterThan15() {
        assertFalse(solution.isValidInput("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII"));
    }

    @Test
    public void inputHasInvalidCharacter() {
        assertFalse(solution.isValidInput("IIIAV"));
    }

    @Test
    public void outputEqual0() {
        assertFalse(solution.isValidOutput(0));
    }

    @Test
    public void outputGreaterThan3999() {
        assertFalse(solution.isValidOutput(4000));
    }

    @Test
    public void outputIs3() {
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    public void outputIs58() {
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    public void outputIs1994() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}
