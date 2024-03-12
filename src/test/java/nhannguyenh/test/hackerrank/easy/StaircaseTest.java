package nhannguyenh.test.hackerrank.easy;

import nhannguyenh.hackerrank.easy.Staircase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StaircaseTest {
    private Staircase solution;

    @BeforeEach
    void setup() {
        solution = new Staircase();
    }

    @AfterEach
    void tearDown() {
        solution = null;
    }

    @Test
    void giveMinusInput_thenThrowException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> solution.staircase(-1),
                String.format("%d is invalid input value", -1)
        );
    }

    @Test
    void giveInputEqual0_thenThrowException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> solution.staircase(0),
                String.format("%d is invalid input value", 0)
        );
    }

    @Test
    void giveInputGreaterThan100_thenThrowException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> solution.staircase(101),
                String.format("%d is invalid input value", 101)
        );
    }

    @Test
    void giveInputEqual1_thenReturnResult() {
        assertEquals("#", solution.staircase(1));
    }

    @Test
    void giveInputEqual2_thenReturnResult() {
        String expectedOutput =
                """
                         #
                        ##""";
        assertEquals(expectedOutput, solution.staircase(2));
    }

    @Test
    void giveInputEqual3_thenReturnResult() {
        String expectedOutput =
                """
                          #
                         ##
                        ###""";
        assertEquals(expectedOutput, solution.staircase(3));
    }

    @Test
    void giveInputEqual4_thenReturnResult() {
        String expectedOutput =
                """
                           #
                          ##
                         ###
                        ####""";
        assertEquals(expectedOutput, solution.staircase(4));
    }

    @Test
    void giveInputEqual6_thenReturnResult() {
        String expectedOutput =
                """
                             #
                            ##
                           ###
                          ####
                         #####
                        ######""";
        assertEquals(expectedOutput, solution.staircase(6));
    }

    @Test
    void giveInputEqual10_thenReturnResult() {
        String expectedOutput =
                """
                                 #
                                ##
                               ###
                              ####
                             #####
                            ######
                           #######
                          ########
                         #########
                        ##########""";
        assertEquals(expectedOutput, solution.staircase(10));
    }
}
