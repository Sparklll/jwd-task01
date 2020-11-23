package by.training.jwd.task01.problem2;

public class Problem2 {

    /* Составить программу, которая по заданным году и номеру
    месяца определяет количество дней в этом месяце и корректно
    определялись все високосные года. */

    /* [Important note taken from Java docs] The leap year check is proleptic - applying the same rules into the
    far future and far past. This is historically inaccurate, but is correct for the ISO-8601 standard. */

    private enum Month {
        NOT_SET, JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    }

    public int getNumberOfDaysInMonth(int year, int month) {
        if(month < 1 || month > 12)
            throw new IllegalArgumentException("Wrong month number");

        if (month == Month.FEB.ordinal()) {
            if (isLeap(year)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == Month.APR.ordinal()
                    || month == Month.JUN.ordinal()
                    || month == Month.SEP.ordinal()
                    || month == Month.NOV.ordinal()) {
            return 30;
        }
        return 31;
    }

    private boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        return year % 4 == 0;
    }
}
