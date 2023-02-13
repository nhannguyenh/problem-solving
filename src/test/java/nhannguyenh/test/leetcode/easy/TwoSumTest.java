package nhannguyenh.test.leetcode.easy;

import nhannguyenh.leetcode.easy.TwoSum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {
    private TwoSum solution;

    @Before
    public void setup() {
        solution = new TwoSum();
    }

    @After
    public void tearDown() {
        solution = null;
    }

    @Test
    public void invalidArrayLengthCase1() {
        assertArrayEquals(new int[]{}, solution.twoSum(new int[]{1}, 10));
    }

    @Test
    public void invalidArrayLengthCase2() {
        Double size = Math.pow(10, 5);
        int[] nums = new int[size.intValue()];
        assertArrayEquals(new int[]{}, solution.twoSum(nums, 10));
    }

    @Test
    public void invalidTargetCase1() {
        int[] nums = {2, 7, 11, 15};
        Double target = Math.pow(-10, 9) - 1;
        assertArrayEquals(new int[]{}, solution.twoSum(nums, target.intValue()));
    }

    @Test
    public void invalidTargetCase2() {
        int[] nums = {2, 7, 11, 15};
        Double target = Math.pow(10, 9) + 1;
        assertArrayEquals(new int[]{}, solution.twoSum(nums, target.intValue()));
    }

    @Test
    public void invalidElementCase1() {
        Double e = Math.pow(-10, 9) - 1;
        int[] nums = {e.intValue(), 1, 2};
        assertArrayEquals(new int[]{}, solution.twoSum(nums, 3));
    }

    @Test
    public void invalidElementCase2() {
        Double e = Math.pow(10, 9) + 1;
        int[] nums = {e.intValue(), 1, 2};
        assertArrayEquals(new int[]{}, solution.twoSum(nums, 3));
    }

    @Test
    public void validTestCase1() {
        int[] nums = {2, 7, 11, 15};
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, 9));
    }

    @Test
    public void validTestCase2() {
        int[] nums = {3, 2, 4};
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(nums, 6));
    }

    @Test
    public void validTestCase3() {
        int[] nums = {3, 3};
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, 6));
    }
}
