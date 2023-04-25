package nhannguyenh.test.geeksforgeeks.school;

import nhannguyenh.geeksforgeeks.school.RemainderEvaluation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RemainderEvaluationTest {
    private RemainderEvaluation solution;

    @BeforeEach
    public void setup() {
        solution = new RemainderEvaluation();
    }

    @AfterEach
    public void tearDown() {
        solution = null;
    }

    @ParameterizedTest
    @CsvSource({
            "-1, 2",
            "1000001, 2",
            "2, 0",
            "2, 1000001"
    })
    void givenInvalidInput_thenReturnException(int num1, int num2) {
        Throwable exception = assertThrows(
                InvalidParameterException.class, () -> {
                    solution.findRemainder(num1, num2);
                }
        );
        assertEquals("Invalid input values", exception.getMessage());
    }

    @Test
    void given5And3_thenReturn2() {
        assertEquals(2, solution.findRemainder(5, 3));
    }

    @Test
    void given5And10_thenReturn2() {
        assertEquals(5, solution.findRemainder(5, 10));
    }
}
