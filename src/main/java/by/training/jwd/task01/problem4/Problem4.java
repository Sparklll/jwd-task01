package by.training.jwd.task01.problem4;

public class Problem4 {

    /* Составить программу, печатающую значение true,
    если указанное высказывание является истинным, и false — в противном случае:
    среди заданных целых чисел А, В, С, D есть хотя бы два четных. */

    public boolean hasTwoEvenNumbers(int a, int b, int c, int d) {
        return countEvenNumbers(a, b, c, d) >= 2;
    }

    private int countEvenNumbers(int... numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
