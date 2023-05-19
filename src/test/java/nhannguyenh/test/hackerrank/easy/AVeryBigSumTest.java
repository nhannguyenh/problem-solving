package nhannguyenh.test.hackerrank.easy;

import nhannguyenh.hackerrank.easy.AVeryBigSum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AVeryBigSumTest {
    private AVeryBigSum solution;

    @BeforeEach
    public void setup() {
        solution = new AVeryBigSum();
    }

    @AfterEach
    public void tearDown() {
        solution = null;
    }

    @Test
    void giveListHas5Elements_ThenReturnResult() {
        List<Long> inputArray = List.of(
                1000000001L,
                1000000002L,
                1000000003L,
                1000000004L,
                1000000005L
        );
        assertEquals(5000000015L, solution.aVeryBigSum(inputArray));
    }
}
