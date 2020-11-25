package by.training.jwd.task01.problem10;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problem10 {

    /* Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
    Результат представить в виде таблицы, первый столбец которой – значения аргумента,
    второй - соответствующие значения функции. F(x) = tg(x). */


    /* Prohibited points are (P/2 + 2Pn) and (-P/2 + 2Pn) but we'll never never meet them exactly in our function*/

    public Map<Double, Double> calculateFunction(double lowerX, double topX, double step) {
        if (lowerX >= topX
                || step <= 0
                || !(Double.isFinite(lowerX) && Double.isFinite(topX) && Double.isFinite(step)))
            throw new IllegalArgumentException("Passing invalid parameters");

        Map<Double, Double> functionArgumentsAndValues = new LinkedHashMap<>();
        int valuesNumber = (int) ((topX - lowerX) / step + 1);

        double currentX = lowerX;
        for (int i = 0; i < valuesNumber; i++) {
            functionArgumentsAndValues.put(currentX, Math.tan(currentX));
            currentX += step;
        }

        return functionArgumentsAndValues;
    }

    public void printArgumentAndFunctionValues(Map<Double, Double> functionArgumentsAndValues) {
        functionArgumentsAndValues.forEach((argumentValue, functionValue) -> {
            String text = String.format("[X value : %.3f] [Y value : %.3f]", argumentValue, functionValue);
            System.out.println(text);
        });
    }
}
