package by.training.jwd.task01.problem6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem6Test {
    Problem6 problemInstance;

    @BeforeEach
    void initializeInstance() {
        problemInstance = new Problem6();
    }

    @Test
    void getDayTimeByPassedSeconds_InvalidNumberOfPassedSeconds_IllegalArgumentExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> problemInstance.getDayTimeByPassedSeconds(90000));
    }

    @Test
    void getDayTimeByPassedSeconds_15400PassedSeconds_TimeIs4h16m40s() {
        String expected = "4h : 16m : 40s";
        String actual = problemInstance.getDayTimeByPassedSeconds(15400);
        assertEquals(expected, actual);
    }

    @Test
    void getDayTimeByPassedSeconds_86400PassedSeconds_TimeIs24h0m0s() {
        String expected = "24h : 0m : 0s";
        String actual = problemInstance.getDayTimeByPassedSeconds(86400);
        assertEquals(expected, actual);
    }

    @Test
    void getDayTimeByPassedSeconds_ZeroPassedSeconds_TimeIs0h0m0s() {
        String expected = "0h : 0m : 0s";
        String actual = problemInstance.getDayTimeByPassedSeconds(0);
        assertEquals(expected, actual);
    }
}