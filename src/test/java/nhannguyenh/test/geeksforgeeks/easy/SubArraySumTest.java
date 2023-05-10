package nhannguyenh.test.geeksforgeeks.easy;

import nhannguyenh.geeksforgeeks.easy.SubArraySum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SubArraySumTest {
    private SubArraySum solution;

    @BeforeEach
    public void setup() {
        solution = new SubArraySum();
    }

    @AfterEach
    public void tearDown() {
        solution = null;
    }

    @Test
    void givenN5Sum12_thenReturnResult() {
        int[] inputArray = new int[]{1, 2, 3, 7, 5};
        List<Integer> expectedResult = Arrays.asList(2, 4);
        List<Integer> actualResult = solution.subarraySum(inputArray, inputArray.length, 12);

        assertEquals(expectedResult.size(), actualResult.size());
        assertTrue(expectedResult.containsAll(actualResult));
    }

    @Test
    void givenN10Sum15_thenReturnResult() {
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> expectedResult = Arrays.asList(1, 5);
        List<Integer> actualResult = solution.subarraySum(inputArray, inputArray.length, 15);

        assertEquals(expectedResult.size(), actualResult.size());
        assertTrue(expectedResult.containsAll(actualResult));
    }

    @Test
    void givenN5Sum12_thenReturnNoSubArrayResult() {
        int[] inputArray = new int[]{1, 4, 3, 7, 6};
        List<Integer> expectedResult = List.of(-1);
        List<Integer> actualResult = solution.subarraySum(inputArray, inputArray.length, 12);

        assertEquals(expectedResult.size(), actualResult.size());
    }
}
