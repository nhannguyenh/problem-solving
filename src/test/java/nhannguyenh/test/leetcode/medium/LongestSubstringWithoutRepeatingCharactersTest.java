package nhannguyenh.test.leetcode.medium;

import nhannguyenh.leetcode.medium.LongestSubstringWithoutRepeatingCharacters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {
    private LongestSubstringWithoutRepeatingCharacters solution;

    @Before
    public void setup() {
        solution = new LongestSubstringWithoutRepeatingCharacters();
    }

    @After
    public void tearDown() {
        solution = null;
    }

    @Test
    public void invalidStringLength() {
        Double maxStringLength = 5 * Math.pow(10, 4);
        String input = " ".repeat(maxStringLength.intValue() + 1);
        assertEquals(-1, solution.lengthOfLongestSubstring(input));
    }

    @Test
    public void invalidCharacterTestCase1() {
        assertEquals(-1, solution.lengthOfLongestSubstring("~"));
    }

    @Test
    public void invalidCharacterTestCase2() {
        assertEquals(-1, solution.lengthOfLongestSubstring("!"));
    }

    @Test
    public void invalidCharacterTestCase3() {
        assertEquals(-1, solution.lengthOfLongestSubstring("@"));
    }

    @Test
    public void invalidCharacterTestCase4() {
        assertEquals(-1, solution.lengthOfLongestSubstring("#"));
    }

    @Test
    public void invalidCharacterTestCase5() {
        assertEquals(-1, solution.lengthOfLongestSubstring("$"));
    }

    @Test
    public void invalidCharacterTestCase6() {
        assertEquals(-1, solution.lengthOfLongestSubstring("%"));
    }

    @Test
    public void invalidCharacterTestCase7() {
        assertEquals(-1, solution.lengthOfLongestSubstring("^"));
    }

    @Test
    public void invalidCharacterTestCase8() {
        assertEquals(-1, solution.lengthOfLongestSubstring("&"));
    }

    @Test
    public void invalidCharacterTestCase9() {
        assertEquals(-1, solution.lengthOfLongestSubstring("*"));
    }

    @Test
    public void invalidCharacterTestCase10() {
        assertEquals(-1, solution.lengthOfLongestSubstring("("));
    }

    @Test
    public void invalidCharacterTestCase11() {
        assertEquals(-1, solution.lengthOfLongestSubstring("?"));
    }

    @Test
    public void invalidCharacterTestCase12() {
        assertEquals(-1, solution.lengthOfLongestSubstring("{"));
    }

    @Test
    public void invalidCharacterTestCase13() {
        assertEquals(-1, solution.lengthOfLongestSubstring("}"));
    }

    @Test
    public void invalidCharacterTestCase14() {
        assertEquals(-1, solution.lengthOfLongestSubstring("["));
    }

    @Test
    public void invalidCharacterTestCase15() {
        assertEquals(-1, solution.lengthOfLongestSubstring("]"));
    }

    @Test
    public void invalidCharacterTestCase16() {
        assertEquals(-1, solution.lengthOfLongestSubstring("_"));
    }

    @Test
    public void invalidCharacterTestCase17() {
        assertEquals(-1, solution.lengthOfLongestSubstring("-"));
    }

    @Test
    public void invalidCharacterTestCase18() {
        assertEquals(-1, solution.lengthOfLongestSubstring("+"));
    }

    @Test
    public void invalidCharacterTestCase19() {
        assertEquals(-1, solution.lengthOfLongestSubstring("="));
    }

    @Test
    public void invalidCharacterTestCase20() {
        assertEquals(-1, solution.lengthOfLongestSubstring(";"));
    }

    @Test
    public void invalidCharacterTestCase21() {
        assertEquals(-1, solution.lengthOfLongestSubstring(":"));
    }

    @Test
    public void invalidCharacterTestCase22() {
        assertEquals(-1, solution.lengthOfLongestSubstring("\'"));
    }

    @Test
    public void invalidCharacterTestCase23() {
        assertEquals(-1, solution.lengthOfLongestSubstring("\""));
    }

    @Test
    public void invalidCharacterTestCase24() {
        assertEquals(-1, solution.lengthOfLongestSubstring("|"));
    }

    @Test
    public void invalidCharacterTestCase25() {
        assertEquals(-1, solution.lengthOfLongestSubstring("\\"));
    }

    @Test
    public void invalidCharacterTestCase26() {
        assertEquals(-1, solution.lengthOfLongestSubstring(","));
    }

    @Test
    public void invalidCharacterTestCase27() {
        assertEquals(-1, solution.lengthOfLongestSubstring("<"));
    }

    @Test
    public void invalidCharacterTestCase28() {
        assertEquals(-1, solution.lengthOfLongestSubstring("."));
    }

    @Test
    public void invalidCharacterTestCase29() {
        assertEquals(-1, solution.lengthOfLongestSubstring(">"));
    }

    @Test
    public void invalidCharacterTestCase30() {
        assertEquals(-1, solution.lengthOfLongestSubstring("/"));
    }

    @Test
    public void invalidCharacterTestCase31() {
        assertEquals(-1, solution.lengthOfLongestSubstring("?"));
    }

    @Test
    public void invalidCharacterTestCase32() {
        assertEquals(-1, solution.lengthOfLongestSubstring("`"));
    }

    @Test
    public void validTestCase1() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void validTestCase2() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void validTestCase3() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void validTestCase4() {
        assertEquals(1, solution.lengthOfLongestSubstring(" "));
    }

    @Test
    public void validTestCase5() {
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
    }
}
