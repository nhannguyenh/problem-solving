package nhannguyenh.test.hackerrank.easy;

import nhannguyenh.hackerrank.easy.AppleAndOrange;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleAndOrangeTest {
    private AppleAndOrange solution;

    @BeforeEach
    void setup() {
        solution = new AppleAndOrange();
    }

    @AfterEach
    void tearDown() {
        solution = null;
    }

    @Test
    void giveValidInput_thenReturnTheNumberOfApplesAndOrange() {
        List<Long> expectedResult = Arrays.asList(1L, 1L);
        List<Long> actualResult = solution.countApplesAndOranges(7, 11, 5, 15, Arrays.asList(-2, 2, 1), Arrays.asList(-5, 6));

        assertEquals(expectedResult.size(), actualResult.size());
        for (int i = 0; i < actualResult.size(); i++) {
            assertEquals(expectedResult.get(i), actualResult.get(i));
        }
    }
}
