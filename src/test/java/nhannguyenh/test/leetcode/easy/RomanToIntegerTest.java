package nhannguyenh.test.leetcode.easy;

import nhannguyenh.leetcode.easy.RomanToInteger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

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
        assertEquals(-1, solution.romanToInt(""));
    }

    @Test
    public void inputLengthGreaterThan15() {
        assertEquals(-1 ,solution.romanToInt("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII"));
    }

    @Test
    public void inputHasInvalidCharacter() {
        assertEquals(-1, solution.romanToInt("IIIAV"));
    }

    @Test
    public void outputEqual0() {
        assertEquals(-1 ,solution.romanToInt(""));
    }

    @Test
    public void outputGreaterThan3999() {
        assertEquals(-1, solution.romanToInt("MMMM"));
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
