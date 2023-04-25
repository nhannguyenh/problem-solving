package nhannguyenh.test.geeksforgeeks.school;

import nhannguyenh.geeksforgeeks.school.SumElementsInMatrix;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumElementsInMatrixTest {
    private static final String INVALID_MATRIX_EXCEPTION_MESSAGE = "The matrix is invalid";
    private static final String INVALID_MATRIX_ELEMENT_EXCEPTION_MESSAGE = "The matrix element is invalid";
    private SumElementsInMatrix solution;

    @BeforeEach
    public void setup() {
        solution = new SumElementsInMatrix();
    }

    @AfterEach
    public void tearDown() {
        solution = null;
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1001, 1",
            "1, 0",
            "1, 1001"
    })
    void givenInvalidMatrixSize_thenThrowException(int row, int column) {
        Throwable exception = assertThrows(
                InvalidParameterException.class, () -> {
                    solution.sumOfMatrix(row, column, new int[row][column]);
                }
        );
        assertEquals(INVALID_MATRIX_EXCEPTION_MESSAGE, exception.getMessage());
    }

    @Test
    void givenMatrixElementLessThanMinus1000_thenThrowException() {
        int[][] grid = {
                {-1001, 0, 1},
                {-8, 9, -2}
        };
        Throwable exception = assertThrows(
                InvalidParameterException.class, () -> {
                    solution.sumOfMatrix(2, 3, grid);
                }
        );
        assertEquals(INVALID_MATRIX_ELEMENT_EXCEPTION_MESSAGE, exception.getMessage());
    }

    @Test
    void givenMatrixElementGreaterThan1000_thenThrowException() {
        int[][] grid = {
                {-1, 0, 1001},
                {-8, 9, -2}
        };
        Throwable exception = assertThrows(
                InvalidParameterException.class, () -> {
                    solution.sumOfMatrix(2, 3, grid);
                }
        );
        assertEquals(INVALID_MATRIX_ELEMENT_EXCEPTION_MESSAGE, exception.getMessage());
    }

    @Test
    void givenValidMatrixElementsCase1_thenReturn1() {
        int[][] grid = {
                {1, 0, 1},
                {-8, 9, -2}
        };
        assertEquals(1, solution.sumOfMatrix(2, 3, grid));
    }

    @Test
    void givenValidMatrixElementsCase2_thenReturn0() {
        int[][] grid = {
                {1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0},
                {-1, -1, -1, -1, -1}
        };
        assertEquals(0, solution.sumOfMatrix(3, 5, grid));
    }
}
