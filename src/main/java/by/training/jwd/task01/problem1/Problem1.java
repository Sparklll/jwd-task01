package by.training.jwd.task01.problem1;

public class Problem1 {

    /* Написать программу, позволяющую по последней цифре числа
    определить последнюю цифру его квадрата. */

    public int obtainLastDigitOfSquareNumber(int number) {
        int lastDigitOfNumber = number % 10;
        return (int) Math.pow(lastDigitOfNumber, 2) % 10;
    }
}
