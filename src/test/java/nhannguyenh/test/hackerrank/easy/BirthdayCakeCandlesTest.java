package nhannguyenh.test.hackerrank.easy;

import nhannguyenh.hackerrank.easy.BirthdayCakeCandles;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BirthdayCakeCandlesTest {
    public static final String THE_NUMBER_OF_CANDLE_IS_INVALID_MESSAGE = "The number of candle is invalid";
    private BirthdayCakeCandles solution;

    @BeforeEach
    void setup() {
        solution = new BirthdayCakeCandles();
    }

    @AfterEach
    void tearDown() {
        solution = null;
    }

    @Test
    void givenEmptyArray_thenThrowException() {
        try {
            solution.birthdayCakeCandles(new ArrayList<>());
        } catch (InvalidParameterException e) {
            assertEquals(THE_NUMBER_OF_CANDLE_IS_INVALID_MESSAGE, e.getMessage());
        }
    }

    @Test
    void givenInputHasOver100000Elements_thenThrowException() {
        try {
            solution.birthdayCakeCandles(Arrays.asList(new Integer[100001]));
        } catch (InvalidParameterException e) {
            assertEquals(THE_NUMBER_OF_CANDLE_IS_INVALID_MESSAGE, e.getMessage());
        }
    }

    @Test
    void testCase1_givenValidInput_thenReturnResult() {
        assertEquals(2, solution.birthdayCakeCandles(List.of(4, 4, 1, 3)));
    }

    @Test
    void testCase2_givenValidInput_thenReturnResult() {
        assertEquals(1, solution.birthdayCakeCandles(List.of(4)));
    }

    @Test
    void testCase3_givenValidInput_thenReturnResult() {
        assertEquals(1, solution.birthdayCakeCandles(List.of(4, 5, 6, 7, 8)));
    }
}
