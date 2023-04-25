package nhannguyenh.test.leetcode.easy;

import nhannguyenh.leetcode.easy.RomanToInteger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {
    private RomanToInteger solution;

    @BeforeEach
    public void setup() {
        solution = new RomanToInteger();
    }

    @AfterEach
    public void tearDown() {
        solution = null;
    }

    @Test
    void inputLengthEqual0_thenReturnMinus1() {
        assertEquals(-1, solution.romanToInt(""));
    }

    @Test
    void inputLengthGreaterThan15_thenReturnMinus1() {
        assertEquals(-1 ,solution.romanToInt("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII"));
    }

    @Test
    void inputHasInvalidCharacter_thenReturnMinus1() {
        assertEquals(-1, solution.romanToInt("IIIAV"));
    }

    @Test
    void outputEqual0_thenReturnMinus1() {
        assertEquals(-1 ,solution.romanToInt(""));
    }

    @Test
    void outputGreaterThan3999_thenReturnMinus1() {
        assertEquals(-1, solution.romanToInt("MMMM"));
    }

    @Test
    void givenIII_thenRetun3() {
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    void givenLVIII_thenReturn58() {
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    void givenMCMXCIV_thenReturn1994() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}
