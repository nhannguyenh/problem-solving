package nhannguyenh.test.geeksforgeeks.school;

import nhannguyenh.geeksforgeeks.school.SumElementsInMatrix;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

public class SumElementsInMatrixTest {
    private static final String INVALID_MATRIX_EXCEPTION_MESSAGE = "The matrix is invalid";
    private static final String INVALID_MATRIX_ELEMENT_EXCEPTION_MESSAGE = "The matrix element is invalid";
    private SumElementsInMatrix solution;

    @Before
    public void setup() {
        solution = new SumElementsInMatrix();
    }

    @After
    public void tearDown() {
        solution = null;
    }

    @Test
    public void rowLessThan1() {
        int row = 0;
        int column = 1;
        Throwable exception = assertThrows(
                InvalidParameterException.class, () -> {
                    solution.sumOfMatrix(row, column, new int[row][column]);
                }
        );
        assertEquals(INVALID_MATRIX_EXCEPTION_MESSAGE, exception.getMessage());
    }

    @Test
    public void rowGreaterThan1000() {
        int row = 1001;
        int column = 1;
        Throwable exception = assertThrows(
                InvalidParameterException.class, () -> {
                    solution.sumOfMatrix(row, column, new int[row][column]);
                }
        );
        assertEquals(INVALID_MATRIX_EXCEPTION_MESSAGE, exception.getMessage());
    }

    @Test
    public void columnLessThan1() {
        int row = 1;
        int column = 0;
        Throwable exception = assertThrows(
                InvalidParameterException.class, () -> {
                    solution.sumOfMatrix(row, column, new int[row][column]);
                }
        );
        assertEquals(INVALID_MATRIX_EXCEPTION_MESSAGE, exception.getMessage());
    }

    @Test
    public void columnGreaterThan1000() {
        int row = 1;
        int column = 1001;
        Throwable exception = assertThrows(
                InvalidParameterException.class, () -> {
                    solution.sumOfMatrix(row, column, new int[row][column]);
                }
        );
        assertEquals(INVALID_MATRIX_EXCEPTION_MESSAGE, exception.getMessage());
    }

    @Test
    public void matrixElementLessThanMinus1000() {
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
    public void matrixElementGreaterThan1000() {
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
    public void validTestCase1() {
        int[][] grid = {
                {1, 0, 1},
                {-8, 9, -2}
        };
        assertEquals(1, solution.sumOfMatrix(2, 3, grid));
    }

    @Test
    public void validTestCase2() {
        int[][] grid = {
                {1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0},
                {-1, -1, -1, -1, -1}
        };
        assertEquals(0, solution.sumOfMatrix(3, 5, grid));
    }
}
