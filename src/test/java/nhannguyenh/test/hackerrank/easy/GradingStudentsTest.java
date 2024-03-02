package nhannguyenh.test.hackerrank.easy;

import nhannguyenh.hackerrank.easy.GradingStudents;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class GradingStudentsTest {
    private static final String INVALID_NUMBER_STUDENT_EXCEPTION = "The numbers of student is invalid";
    private static final String INVALID_GRADE_VALUE_EXCEPTION = "The grade value is invalid";
    private GradingStudents solution;

    @BeforeEach
    void setup() {
        solution = new GradingStudents();
    }

    @AfterEach
    void tearDown() {
        solution = null;
    }

    @Test
    void givenListStudentLessThan1_thanThrowException() {
        try {
            solution.gradingStudents(new ArrayList<>());
        } catch (InvalidParameterException exception) {
            assertEquals(INVALID_NUMBER_STUDENT_EXCEPTION, exception.getMessage());
        }
    }

    @Test
    void givenListStudentGreaterThan60_thanThrowException() {
        try {
            solution.gradingStudents(Arrays.asList(new Integer[61]));
        } catch (InvalidParameterException exception) {
            assertEquals(INVALID_NUMBER_STUDENT_EXCEPTION, exception.getMessage());
        }
    }

    @Test
    void givenGradeLessThan0_thanThowException() {
        try {
            solution.gradingStudents(List.of(-1));
        } catch (InvalidParameterException exception) {
            assertEquals(INVALID_GRADE_VALUE_EXCEPTION, exception.getMessage());
        }
    }

    @Test
    void givenGradeGreaterThan100_thanThowException() {
        try {
            solution.gradingStudents(List.of(101));
        } catch (InvalidParameterException exception) {
            assertEquals(INVALID_GRADE_VALUE_EXCEPTION, exception.getMessage());
        }
    }

    @Test
    void givenListHasGradeValueIs0_thenReturnCorrectOutput() {
        List<Integer> output = solution.gradingStudents(List.of(0, 29, 84));

        assertEquals(3, output.size());
        assertIterableEquals(List.of(0, 29, 85), output);
    }

    @Test
    void givenListHasGradeValueIs100_thenReturnCorrectOutput() {
        List<Integer> output = solution.gradingStudents(List.of(100, 73, 67, 38, 33));

        assertEquals(5, output.size());
        assertIterableEquals(List.of(100, 75, 67, 40, 33), output);
    }
}
