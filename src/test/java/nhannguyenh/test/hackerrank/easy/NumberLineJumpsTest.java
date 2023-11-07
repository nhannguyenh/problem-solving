package nhannguyenh.test.hackerrank.easy;

import nhannguyenh.hackerrank.easy.NumberLineJumps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberLineJumpsTest {
    private NumberLineJumps solution;

    @BeforeEach
    public void setup() {
        solution = new NumberLineJumps();
    }

    @AfterEach
    public void tearDown() {
        solution = null;
    }

    @Test
    void give2112_thenReturnYes() {
        assertEquals(NumberLineJumps.YES, solution.kangaroo(2, 1, 1, 2));
    }

    @Test
    void give0342_thenReturnYes() {
        assertEquals(NumberLineJumps.YES, solution.kangaroo(0, 3, 4, 2));
    }

    @Test
    void give0253_thenReturnNo() {
        assertEquals(NumberLineJumps.NO, solution.kangaroo(0, 2, 5, 3));
    }

    @Test
    void giveX1LessThan0_thenReturnNo() {
        assertEquals(NumberLineJumps.NO, solution.kangaroo(-1, 1, 1, 2));
    }

    @Test
    void giveX2LessThan0_thenReturnNo() {
        assertEquals(NumberLineJumps.NO, solution.kangaroo(2, -1, 1, 2));
    }

    @Test
    void giveX1GreaterThan10000_thenReturnNo() {
        assertEquals(NumberLineJumps.NO, solution.kangaroo(10001, 1, 1, 2));
    }

    @Test
    void giveX2GreaterThan10000_thenReturnNo() {
        assertEquals(NumberLineJumps.NO, solution.kangaroo(2, 10001, 1, 2));
    }

    @Test
    void giveX1LessThanX2AndV1LessThanV2_thenReturnNo() {
        assertEquals(NumberLineJumps.NO, solution.kangaroo(0, 3, 2, 4));
    }
}
