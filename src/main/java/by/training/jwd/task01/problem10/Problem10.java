package by.training.jwd.task01.problem10;

public class Problem10 {

    /* Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
    Результат представить в виде таблицы, первый столбец которой – значения аргумента,
    второй - соответствующие значения функции. F(x) = tg(x). */


    /* Prohibited points are (P/2 + 2Pn) and (-P/2 + 2Pn) but we'll never never meet them exactly in our function*/

    public void calculateFunction(double lowerX, double topX, double step) {
        int valuesNumber = (int) ((topX - lowerX) / step + 1);

        double[] argumentValues = new double[valuesNumber];
        double[] functionValues = new double[valuesNumber];

        double currentX = lowerX;
        for (int i = 0; i < valuesNumber; i++) {
            functionValues[i] = Math.tan(currentX);
            argumentValues[i] = currentX;
            currentX += step;
        }

        for (int i = 0; i < valuesNumber; i++) {
            String text = String.format("#%d [X value : %.3f] [Y value : %.3f]", i, argumentValues[i], functionValues[i]);
            System.out.println(text);
        }
    }
}
