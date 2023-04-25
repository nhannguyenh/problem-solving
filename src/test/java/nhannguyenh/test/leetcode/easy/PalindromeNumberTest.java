package nhannguyenh.test.leetcode.easy;

import nhannguyenh.leetcode.easy.PalindromeNumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {
    private PalindromeNumber solution;

    @BeforeEach
    public void setup() {
        solution = new PalindromeNumber();
    }

    @AfterEach
    public void tearDown() {
        solution = null;
    }

    @Test
    void given121_thenReturnTrue() {
        assertTrue(solution.isPalindrome(121));
    }

    @Test
    void givenMinus121_thenReturnFalse() {
        assertFalse(solution.isPalindrome(-121));
    }

    @Test
    void given10_thenReturnFalse() {
        assertFalse(solution.isPalindrome(10));
    }

    @Test
    void given11_thenReturnTrue() {
        assertTrue(solution.isPalindrome(11));
    }

    @Test
    void given1_thenReturnTrue() {
        assertTrue(solution.isPalindrome(1));
    }
}
