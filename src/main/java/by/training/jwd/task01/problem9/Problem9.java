package by.training.jwd.task01.problem9;

public class Problem9 {

    /* Вычислить длину окружности и площадь круга одного и того же заданного радиуса R. */

    public double getCircumference(double circleRadius) {
        if (circleRadius < 0)
            throw new IllegalArgumentException("Invalid radius value");

        return 2 * Math.PI * circleRadius;
    }

    public double getCircleArea(double circleRadius) {
        if(circleRadius < 0)
            throw new IllegalArgumentException("Invalid radius value");

        return Math.PI * Math.pow(circleRadius, 2);
    }
}
