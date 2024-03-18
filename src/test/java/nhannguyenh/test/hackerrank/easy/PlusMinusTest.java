package nhannguyenh.test.hackerrank.easy;

import nhannguyenh.hackerrank.easy.PlusMinus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlusMinusTest {
    private PlusMinus solution;

    @BeforeEach
    void setup() {
        solution = new PlusMinus();
    }

    @AfterEach
    void tearDown() {
        solution = null;
    }

    @Test
    void giveEmptyArray_thenThrowException() {
        try {
            solution.plusMinus(new ArrayList<>());
        } catch (InvalidParameterException e) {
            assertEquals("The input array has invalid size value", e.getMessage());
        }
    }

    @Test
    void giveArrayHasMoreThan100Elements_thenThrowException() {
        try {
            solution.plusMinus(Arrays.asList(new Integer[101]));
        } catch (InvalidParameterException e) {
            assertEquals("The input array has invalid size value", e.getMessage());
        }
    }

    @Test
    void giveElementLessThanMinus100_thenThrowException() {
        try {
            solution.plusMinus(List.of(-101));
        } catch (IllegalArgumentException e) {
            assertEquals(String.format("%d is invalid value", -101), e.getMessage());
        }
    }

    @Test
    void giveElementGreaterThan100_thenThrowException() {
        try {
            solution.plusMinus(List.of(101));
        } catch (IllegalArgumentException e) {
            assertEquals(String.format("%d is invalid value", 101), e.getMessage());
        }
    }

    @Test
    void giveTestCase1_thenReturnResult() {
        assertEquals(List.of(0.500000, 0.333333, 0.166667), solution.plusMinus(List.of(-4, 3, -9, 0, 4, 1)));
    }

    @Test
    void giveTestCase2_thenReturnResult() {
        assertEquals(List.of(0.400000, 0.400000, 0.200000), solution.plusMinus(List.of(1, 1, 0, -1, -1)));
    }

    @Test
    void giveTestCase3_thenReturnResult() {
        assertEquals(List.of(0.375000, 0.375000, 0.250000), solution.plusMinus(List.of(1, 2, 3, -1, -2, -3, 0, 0)));
    }
}
