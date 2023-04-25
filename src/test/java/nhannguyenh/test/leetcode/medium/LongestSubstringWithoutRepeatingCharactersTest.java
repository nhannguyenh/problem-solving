package nhannguyenh.test.leetcode.medium;

import nhannguyenh.leetcode.medium.LongestSubstringWithoutRepeatingCharacters;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {
    private LongestSubstringWithoutRepeatingCharacters solution;

    @BeforeEach
    public void setup() {
        solution = new LongestSubstringWithoutRepeatingCharacters();
    }

    @AfterEach
    public void tearDown() {
        solution = null;
    }

    @Test
    void givenInvalidStringLength_shouldReturnMinus1() {
        int maxStringLength = 5 * 10000;
        String input = " ".repeat(maxStringLength + 1);
        assertEquals(-1, solution.lengthOfLongestSubstring(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "?", "{", "}", "[", "]", "_", "-",
            "+", "=", ";", ":", "\'", "\"", "|", "\\", ",", "<", ".", ">", "/", "`"
    })
    void givenInvalidCharacterCase1_shouldReturnMinus1(String invalidChar) {
        assertEquals(-1, solution.lengthOfLongestSubstring(invalidChar));
    }

    @Test
    void givenValidStringCase1_thenReturn3() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void givenValidStringCase2_thenReturn1() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void givenValidStringCase3_thenReturn3() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void givenValidStringCase4_thenReturn3() {
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    void givenBlankString_thenReturn1() {
        assertEquals(1, solution.lengthOfLongestSubstring(" "));
    }
}
