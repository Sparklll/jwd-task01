package by.training.jwd.task01.problem3;

public class Problem3 {

    /* Окружность вписана в квадрат заданной площади.
    Найти площадь квадрата, вписанного в эту окружность. */

    public double areaOfSquareInscribedInCircleInscribedInSquare(double circumscribedSquareArea) {
        if(circumscribedSquareArea <= 0)
            throw new IllegalArgumentException("The area of circumscribed figure cannot be less/is equal 0");

        double circumscribedSquareSide = Math.sqrt(circumscribedSquareArea);
        double inscribedCircleRadius = circumscribedSquareSide / 2;

        return calculateAreaOfSquareInscribedInCircle(inscribedCircleRadius);
    }

    private double calculateAreaOfSquareInscribedInCircle(double circleRadius) {
        double inscribedSquareDiameter = circleRadius * 2;
        return Math.pow(inscribedSquareDiameter, 2) / 2;
    }
}
