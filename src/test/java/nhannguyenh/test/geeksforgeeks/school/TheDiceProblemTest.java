package nhannguyenh.test.geeksforgeeks.school;

import nhannguyenh.geeksforgeeks.school.TheDiceProblem;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheDiceProblemTest {
    private TheDiceProblem solution;

    @BeforeEach
    public void setup() {
        solution = new TheDiceProblem();
    }

    @AfterEach
    public void tearDown() {
        solution = null;
    }

    @Test
    void givenFace1_shouldReturn6() {
        assertEquals(6, solution.oppositeFaceOfDice(1));
    }

    @Test
    void givenFace2_shouldReturn5() {
        assertEquals(5, solution.oppositeFaceOfDice(2));
    }

    @Test
    void givenFace3_shouldReturn4() {
        assertEquals(4, solution.oppositeFaceOfDice(3));
    }

    @Test
    void givenFace4_shouldReturn3() {
        assertEquals(3, solution.oppositeFaceOfDice(4));
    }

    @Test
    void givenFace5_shouldReturn2() {
        assertEquals(2, solution.oppositeFaceOfDice(5));
    }

    @Test
    void givenFace6_shouldReturn1() {
        assertEquals(1, solution.oppositeFaceOfDice(6));
    }
}
