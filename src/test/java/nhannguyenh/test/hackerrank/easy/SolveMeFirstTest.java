package nhannguyenh.test.hackerrank.easy;

import nhannguyenh.hackerrank.easy.SolveMeFirst;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolveMeFirstTest {
    private SolveMeFirst solution;

    @BeforeEach
    public void setup() {
        solution = new SolveMeFirst();
    }

    @AfterEach
    public void tearDown() {
        solution = null;
    }

    @Test
    void givenNumber2AndNumber3_thenReturn5() {
        assertEquals(5, solution.sum(2, 3));
    }

    @Test
    void givenNumber100AndNumber1000_thenReturn1100() {
        assertEquals(1100, solution.sum(100, 1000));
    }
}
