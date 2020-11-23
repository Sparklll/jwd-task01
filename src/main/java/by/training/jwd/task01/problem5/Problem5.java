package by.training.jwd.task01.problem5;

public class Problem5 {

    /* Составить программу, печатающую значение true,
    если указанное высказывание является истинным, и false — в противном случае:
    является ли целое число (натуральное!) совершенным (сумма делителей (исключая само число!) равна самому числу). */

    public boolean isNumberPerfect(int number) {
        if (number < 1)
            throw new IllegalArgumentException("The number is not natural");

        int factorsSum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factorsSum += i;
            }
        }
        return factorsSum == number;
    }
}
