package by.training.jwd.task01.problem8;

public class Problem8 {

    /* Вычислить значение функции: F(x) = {-x^2+3x+9, x >= 3; 1/(x^3-6), x < 3} */

    public double functionValue(double x) {
        double prohibitedArgument = Math.pow(6, 1.0/3);
        if(x == prohibitedArgument)
            throw new IllegalArgumentException("This argument value is outside the scope of the function domain");

        if (x < 3) {
            return 1 / (Math.pow(x, 3) - 6);
        } else {
            return -1 * Math.pow(x, 2) + 3 * x + 9;
        }
    }
}
