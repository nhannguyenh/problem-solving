package nhannguyenh.test.geeksforgeeks.school;

import nhannguyenh.geeksforgeeks.school.TheDiceProblem;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TheDiceProblemTest {
    private TheDiceProblem solution;

    @Before
    public void setup() {
        solution = new TheDiceProblem();
    }

    @After
    public void tearDown() {
        solution = null;
    }

    @Test
    public void testOppositeFaceOf1() {
        assertEquals(6, solution.oppositeFaceOfDice(1));
    }

    @Test
    public void testOppositeFaceOf2() {
        assertEquals(5, solution.oppositeFaceOfDice(2));
    }

    @Test
    public void testOppositeFaceOf3() {
        assertEquals(4, solution.oppositeFaceOfDice(3));
    }

    @Test
    public void testOppositeFaceOf4() {
        assertEquals(3, solution.oppositeFaceOfDice(4));
    }

    @Test
    public void testOppositeFaceOf5() {
        assertEquals(2, solution.oppositeFaceOfDice(5));
    }

    @Test
    public void testOppositeFaceOf6() {
        assertEquals(1, solution.oppositeFaceOfDice(6));
    }
}
