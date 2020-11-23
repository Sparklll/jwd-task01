package by.training.jwd.task01.problem7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem7Test {
    Problem7 problemInstance;

    @BeforeEach
    void initializeInstance() {
        problemInstance = new Problem7();
    }

    @Test
    void pointCloserToOrigin_InvalidPointClassInstantiation_InvalidSquareValue_IllegalArgumentExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> {
            Point point = new Point(Double.NaN, Double.POSITIVE_INFINITY);
        });
    }

    @Test
    void pointCloserToOrigin_FirstPointCloserToOrigin_ExpectedOne() {
        Point a = new Point(1, 2);
        Point b = new Point(5, 5);
        int expected = 1;
        int actual = problemInstance.pointCloserToOrigin(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void pointCloserToOrigin_PointsAreEquidistantFromOrigin_ExpectedZero() {
        Point a = new Point(10, 10);
        Point b = new Point(10, 10);
        int expected = 0;
        int actual = problemInstance.pointCloserToOrigin(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void pointCloserToOrigin_SecondPointCloserToOrigin_ExpectedMinusOne() {
        Point a = new Point(5, 5);
        Point b = new Point(1, 2);
        int expected = -1;
        int actual = problemInstance.pointCloserToOrigin(a, b);
        assertEquals(expected, actual);
    }
}