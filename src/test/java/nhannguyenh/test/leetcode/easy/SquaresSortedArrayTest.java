package nhannguyenh.test.leetcode.easy;

import nhannguyenh.leetcode.easy.SquaresSortedArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SquaresSortedArrayTest {
    private SquaresSortedArray solution;

    @BeforeEach
    public void setup() {
        solution = new SquaresSortedArray();
    }

    @AfterEach
    public void tearDown() {
        solution = null;
    }

    @Test
    public void giveArrayThenReturnSquaresSortedArrayTestCase1() {
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, solution.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
    }

    @Test
    public void giveArrayThenReturnSquaresSortedArrayTestCase2() {
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, solution.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
    }
}
