import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class NextDayCalculatorTestTest {
    @Test
    void testNextDay() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String nextDay = (day + 1) + "-" + month + "-" + year;
        String result = NextDayCalculatorTest.getNextDay(day, month, year);
        assertEquals(nextDay, result);
    }

    @Test
    void testNextDay30() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String nextDay = "1-" + (month + 1) + "-" + year;
        String result = NextDayCalculatorTest.getNextDay(day, month, year);
        assertEquals(nextDay, result);
    }

    @Test
    void testNextDay31() {
        int day = 31;
        int month = 3;
        int year = 2018;
        String nextDay = "1-" + (month + 1) + "-" + year;
        String result = NextDayCalculatorTest.getNextDay(day, month, year);
        assertEquals(nextDay, result);
    }

    @Test
    void testNextDay28() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String nextDay = "1-" + (month + 1) + "-" + year;
        String result = NextDayCalculatorTest.getNextDay(day, month, year);
        assertEquals(nextDay, result);
    }

    @Test
    void testNextDay29() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String nextDay = "1-" + (month + 1) + "-" + year;
        String result = NextDayCalculatorTest.getNextDay(day, month, year);
        assertEquals(nextDay, result);
    }

}