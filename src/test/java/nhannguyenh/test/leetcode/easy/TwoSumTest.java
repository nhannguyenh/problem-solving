package nhannguyenh.test.leetcode.easy;

import nhannguyenh.leetcode.easy.TwoSum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    private TwoSum solution;

    @BeforeEach
    public void setup() {
        solution = new TwoSum();
    }

    @AfterEach
    public void tearDown() {
        solution = null;
    }

    @Test
    void givenArrayLengthLessThan2_thenReturnEmptyArray() {
        assertArrayEquals(new int[]{}, solution.twoSum(new int[]{1}, 10));
    }

    @Test
    void givenArrayLengthGreaterThan100000_thenReturnEmptyArray() {
        double size = Math.pow(10, 5);
        int[] nums = new int[(int) size];
        assertArrayEquals(new int[]{}, solution.twoSum(nums, 10));
    }

    @Test
    void givenInvalidTagetNumberCase1_thenReturnEmptyArray() {
        int[] nums = {2, 7, 11, 15};
        double target = Math.pow(-10, 9) - 1;
        assertArrayEquals(new int[]{}, solution.twoSum(nums, (int) target));
    }

    @Test
    void givenInvalidTagetNumberCase2_thenReturnEmptyArray() {
        int[] nums = {2, 7, 11, 15};
        double target = Math.pow(10, 9) + 1;
        assertArrayEquals(new int[]{}, solution.twoSum(nums, (int) target));
    }

    @Test
    void givenInvalidElementCase1_thenReturnEmptyArray() {
        double e = Math.pow(-10, 9) - 1;
        int[] nums = {(int) e, 1, 2};
        assertArrayEquals(new int[]{}, solution.twoSum(nums, 3));
    }

    @Test
    void givenInvalidElementCase2_thenReturnEmptyArray() {
        double e = Math.pow(10, 9) + 1;
        int[] nums = {(int) e, 1, 2};
        assertArrayEquals(new int[]{}, solution.twoSum(nums, 3));
    }

    @Test
    void givenValidArrayHas4ElementsAndTarget_thenReturnCorrectResult() {
        int[] nums = {2, 7, 11, 15};
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, 9));
    }

    @Test
    void givenValidArrayHas3ElementsAndTarget_thenReturnCorrectResult() {
        int[] nums = {3, 2, 4};
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(nums, 6));
    }

    @Test
    void givenValidArrayHas2ElementsAndTarget_thenReturnCorrectResult() {
        int[] nums = {3, 3};
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, 6));
    }
}
