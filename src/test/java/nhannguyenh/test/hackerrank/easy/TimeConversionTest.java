package nhannguyenh.test.hackerrank.easy;

import nhannguyenh.hackerrank.easy.TimeConversion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TimeConversionTest {
    private TimeConversion solution;

    @BeforeEach
    void setup() {
        solution = new TimeConversion();
    }

    @AfterEach
    void tearDown() {
        solution = null;
    }

    @Test
    void giveInvalidInput_thenReturnException() {
        assertThrows(NumberFormatException.class, () -> solution.timeConversion("aa:00:00AM"), "Input time is invalid");
    }

    @Test
    void give12h00m00sAM_thanReturn00h00m00s() {
        assertEquals("00:00:00", solution.timeConversion("12:00:00AM"));
    }

    @Test
    void give01h00m00sAM_thanReturn01h00m00s() {
        assertEquals("01:00:00", solution.timeConversion("01:00:00AM"));
    }

    @Test
    void give02h00m00sAM_thanReturn02h00m00s() {
        assertEquals("02:00:00", solution.timeConversion("02:00:00AM"));
    }

    @Test
    void give03h00m00sAM_thanReturn03h00m00s() {
        assertEquals("03:00:00", solution.timeConversion("03:00:00AM"));
    }

    @Test
    void give04h00m00sAM_thanReturn04h00m00s() {
        assertEquals("04:00:00", solution.timeConversion("04:00:00AM"));
    }

    @Test
    void give05h00m00sAM_thanReturn05h00m00s() {
        assertEquals("05:00:00", solution.timeConversion("05:00:00AM"));
    }

    @Test
    void give06h00m00sAM_thanReturn06h00m00s() {
        assertEquals("06:00:00", solution.timeConversion("06:00:00AM"));
    }

    @Test
    void give07h00m00sAM_thanReturn07h00m00s() {
        assertEquals("07:00:00", solution.timeConversion("07:00:00AM"));
    }

    @Test
    void give08h00m00sAM_thanReturn08h00m00s() {
        assertEquals("08:00:00", solution.timeConversion("08:00:00AM"));
    }

    @Test
    void give09h00m00sAM_thanReturn09h00m00s() {
        assertEquals("09:00:00", solution.timeConversion("09:00:00AM"));
    }

    @Test
    void give10h00m00sAM_thanReturn10h00m00s() {
        assertEquals("10:00:00", solution.timeConversion("10:00:00AM"));
    }

    @Test
    void give11h00m00sAM_thanReturn11h00m00s() {
        assertEquals("11:00:00", solution.timeConversion("11:00:00AM"));
    }

    @Test
    void give12h00m00sPM_thanReturn12h00m00s() {
        assertEquals("12:00:00", solution.timeConversion("12:00:00PM"));
    }

    @Test
    void give01h00m00sPM_thanReturn13h00m00s() {
        assertEquals("13:00:00", solution.timeConversion("01:00:00PM"));
    }

    @Test
    void give02h00m00sPM_thanReturn14h00m00s() {
        assertEquals("14:00:00", solution.timeConversion("02:00:00PM"));
    }

    @Test
    void give03h00m00sPM_thanReturn15h00m00s() {
        assertEquals("15:00:00", solution.timeConversion("03:00:00PM"));
    }

    @Test
    void give04h00m00sPM_thanReturn16h00m00s() {
        assertEquals("16:00:00", solution.timeConversion("04:00:00PM"));
    }

    @Test
    void give05h00m00sPM_thanReturn17h00m00s() {
        assertEquals("17:00:00", solution.timeConversion("05:00:00PM"));
    }

    @Test
    void give06h00m00sPM_thanReturn18h00m00s() {
        assertEquals("18:00:00", solution.timeConversion("06:00:00PM"));
    }

    @Test
    void give07h00m00sPM_thanReturn19h00m00s() {
        assertEquals("19:00:00", solution.timeConversion("07:00:00PM"));
    }

    @Test
    void give08h00m00sPM_thanReturn20h00m00s() {
        assertEquals("20:00:00", solution.timeConversion("08:00:00PM"));
    }

    @Test
    void give09h00m00sPM_thanReturn21h00m00s() {
        assertEquals("21:00:00", solution.timeConversion("09:00:00PM"));
    }

    @Test
    void give10h00m00sPM_thanReturn22h00m00s() {
        assertEquals("22:00:00", solution.timeConversion("10:00:00PM"));
    }

    @Test
    void give11h00m00sPM_thanReturn23h00m00s() {
        assertEquals("23:00:00", solution.timeConversion("11:00:00PM"));
    }
}
