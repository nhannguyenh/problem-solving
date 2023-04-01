package nhannguyenh.test.leetcode.easy;

import nhannguyenh.leetcode.easy.PalindromeNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PalindromeNumberTest {
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
