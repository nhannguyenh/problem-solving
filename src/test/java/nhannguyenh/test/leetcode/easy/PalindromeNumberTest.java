package nhannguyenh.test.leetcode.easy;

import nhannguyenh.leetcode.easy.PalindromeNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PalindromeNumberTest {
    private static final Double MIN_VALUE = Math.pow(2, -31);
    private static final Double MAX_VALUE = Math.pow(2, 31) - 1;
    private PalindromeNumber solution;

    @Before
    public void setup() {
        solution = new PalindromeNumber();
    }

    @After
    public void tearDown() {
        solution = null;
    }

    @Test
    public void invalidInputTestCase1() {
        assertFalse(solution.isPalindrome(MIN_VALUE.intValue() - 1));
    }

    @Test
    public void invalidInputTestCase2() {
        assertFalse(solution.isPalindrome(MAX_VALUE.intValue() + 1));
    }

    @Test
    public void invalidInputTestCase3() {
        assertFalse(solution.isPalindrome(-1));
    }

    @Test
    public void testCase1() {
        assertTrue(solution.isPalindrome(121));
    }

    @Test
    public void testCase2() {
        assertFalse(solution.isPalindrome(-121));
    }

    @Test
    public void testCase3() {
        assertFalse(solution.isPalindrome(10));
    }

    @Test
    public void testCase4() {
        assertTrue(solution.isPalindrome(11));
    }

    @Test
    public void testCase5() {
        assertTrue(solution.isPalindrome(1));
    }
}
