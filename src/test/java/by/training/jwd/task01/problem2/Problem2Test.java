package by.training.jwd.task01.problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {
    Problem2 problemInstance;

    @BeforeEach
    void initializeInstance() {
        problemInstance = new Problem2();
    }

    @Test
    void getNumberOfDaysInMonth_InvalidMonthNumber_IllegalArgumentExceptionThrown() {
        assertThrows(IllegalArgumentException.class,
                () -> problemInstance.getNumberOfDaysInMonth(2020, 100));
    }

    @Test
    void getNumberOfDaysInMonth_LeapYearFebMonth_29Days() {
        int expected = 29;
        int actual = problemInstance.getNumberOfDaysInMonth(2008, 2);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberOfDaysInMonth_NotLeapYearFebMonth_28Days() {
        int expected = 28;
        int actual = problemInstance.getNumberOfDaysInMonth(2009, 2);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberOfDaysInMonth_LeapYearAprMonth_30Days() {
        int expected = 30;
        int actual = problemInstance.getNumberOfDaysInMonth(2008, 4);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberOfDaysInMonth_NotLeapYearAprMonth_30Days() {
        int expected = 30;
        int actual = problemInstance.getNumberOfDaysInMonth(2009, 4);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberOfDaysInMonth_LeapYearDecMonth_31Days() {
        int expected = 31;
        int actual = problemInstance.getNumberOfDaysInMonth(2008, 12);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberOfDaysInMonth_NotLeapYearDecMonth_31Days() {
        int expected = 31;
        int actual = problemInstance.getNumberOfDaysInMonth(2009, 12);
        assertEquals(expected, actual);
    }
}