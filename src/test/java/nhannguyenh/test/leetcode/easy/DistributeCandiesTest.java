package nhannguyenh.test.leetcode.easy;

import nhannguyenh.leetcode.easy.DistributeCandies;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DistributeCandiesTest {
    private DistributeCandies solution;

    @Before
    public void setup() {
        solution = new DistributeCandies();
    }

    @After
    public void tearDown() {
        solution = null;
    }

    @Test
    public void testLengthOdd() {
        int[] candyType = {1, 2, 3};
        assertEquals(-1, solution.distributeCandies(candyType));
    }

    @Test
    public void testLengthGreaterThan10000() {
        int[] candyType = new int[10001];
        assertEquals(-1, solution.distributeCandies(candyType));
    }

    @Test
    public void testLengthLessThan2() {
        int[] candyType = new int[1];
        assertEquals(-1, solution.distributeCandies(candyType));
    }

    @Test
    public void validTestCase1() {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        assertEquals(3, solution.distributeCandies(candyType));
    }

    @Test
    public void validTestCase2() {
        int[] candyType = {1, 1, 2, 3};
        assertEquals(2, solution.distributeCandies(candyType));
    }

    @Test
    public void validTestCase3() {
        int[] candyType = {6, 6, 6, 6};
        assertEquals(1, solution.distributeCandies(candyType));
    }
}
