package nhannguyenh.test.hackerrank.easy;

import nhannguyenh.hackerrank.easy.SimpleArraySum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleArraySumTest {
    private SimpleArraySum solution;

    @BeforeEach
    public void setup() {
        solution = new SimpleArraySum();
    }

    @AfterEach
    public void tearDown() {
        solution = null;
    }

    @Test
    void givenArrayCase1_thenReturnSumOfArray() {
        assertEquals(31, solution.simpleArraySum(List.of(1, 2, 3, 4, 10, 11)));
    }

    @Test
    void givenArrayCase2_thenReturnSumOfArray() {
        assertEquals(20, solution.simpleArraySum(List.of(1, 1, 2, 3, 5, 8)));
    }
}
