package nhannguyenh.test.leetcode.easy;

import nhannguyenh.leetcode.easy.SquaresSortedArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresSortedArrayTest {
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
    void givenEmptyArray_thenReturnException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            solution.sortedSquares(new int[]{});
        });

        assertEquals("Input array is not valid", exception.getMessage());
    }

    @Test
    void givenArrayHasLengthGreaterThan104_thenReturnException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            solution.sortedSquares(new int[]{105});
        });

        assertEquals(String.format("%d is not valid value", 105), exception.getMessage());
    }

    @Test
    void giveArray_thenReturnSquaresSortedArrayTestCase1() {
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, solution.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
    }

    @Test
    void giveArray_thenReturnSquaresSortedArrayTestCase2() {
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, solution.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
    }
}
