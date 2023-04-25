package nhannguyenh.test.leetcode.easy;

import nhannguyenh.leetcode.easy.DistributeCandies;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistributeCandiesTest {
    private DistributeCandies solution;

    @BeforeEach
    public void setup() {
        solution = new DistributeCandies();
    }

    @AfterEach
    public void tearDown() {
        solution = null;
    }

    @Test
    void givenOddLength_shouldReturnMinus1() {
        int[] candyType = {1, 2, 3};
        assertEquals(-1, solution.distributeCandies(candyType));
    }

    @Test
    void givenLengthGreaterThan10000__shouldReturnMinus1() {
        int[] candyType = new int[10001];
        assertEquals(-1, solution.distributeCandies(candyType));
    }

    @Test
    void givenLengthLessThan2_shouldReturnMinus1() {
        int[] candyType = new int[1];
        assertEquals(-1, solution.distributeCandies(candyType));
    }

    @Test
    void given3CandyTypes_shouldReturnNumberOfCandy() {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        assertEquals(3, solution.distributeCandies(candyType));
    }

    @Test
    void given2CandyTypes_shouldReturnNumberOfCandy() {
        int[] candyType = {1, 1, 2, 3};
        assertEquals(2, solution.distributeCandies(candyType));
    }

    @Test
    void given1CandyType_shouldReturnNumberOfCandy() {
        int[] candyType = {6, 6, 6, 6};
        assertEquals(1, solution.distributeCandies(candyType));
    }
}
