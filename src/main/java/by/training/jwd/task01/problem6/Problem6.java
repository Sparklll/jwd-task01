package by.training.jwd.task01.problem6;

public class Problem6 {

    /* Идет n-я секунда суток, определить, сколько полных часов,
   полных минут и секунд прошло к этому моменту. */

    public static final int SECONDS_PER_DAY = 86400;
    public static final int SECONDS_PER_HOUR = 3600;
    public static final int SECONDS_PER_MINUTE = 60;

    public String getDayTimeByPassedSeconds(int passedSeconds) {
        if (passedSeconds < 0 || passedSeconds > SECONDS_PER_DAY)
            throw new IllegalArgumentException("Invalid number of seconds passed in a day");

        int hours;
        int minutes;
        int seconds;

        hours = passedSeconds / SECONDS_PER_HOUR;
        passedSeconds -= hours * SECONDS_PER_HOUR;

        minutes = passedSeconds / SECONDS_PER_MINUTE;
        passedSeconds -= minutes * SECONDS_PER_MINUTE;

        seconds = passedSeconds;
        return hours + "h : " + minutes + "m : " + seconds +"s";
    }
}
