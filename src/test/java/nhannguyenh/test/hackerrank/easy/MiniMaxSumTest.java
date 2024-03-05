package nhannguyenh.test.hackerrank.easy;

import nhannguyenh.hackerrank.easy.MiniMaxSum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiniMaxSumTest {
    private MiniMaxSum solution;

    @BeforeEach
    void setup() {
        solution = new MiniMaxSum();
    }

    @AfterEach
    void tearDown() {
        solution = null;
    }

    @Test
    void testCase1() {
        assertEquals("16 24", solution.miniMaxSum(List.of(1, 3, 5, 7, 9)));
    }

    @Test
    void testCase2() {
        assertEquals("10 14", solution.miniMaxSum(List.of(1, 2, 3, 4, 5)));
    }

    @Test
    void testCase3() {
        assertEquals("2063136757 2744467344", solution.miniMaxSum(List.of(256741038, 623958417, 467905213, 714532089, 938071625)));
    }

    @Test
    void testCase4() {
        assertEquals("2093989309 2548418794", solution.miniMaxSum(List.of(396285104, 573261094, 759641832, 819230764, 364801279)));
    }
}
