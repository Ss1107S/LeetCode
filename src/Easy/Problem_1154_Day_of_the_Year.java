package Easy;

public class Problem_1154_Day_of_the_Year {
    //Language Java
    //Runtime 10ms
    //Memory 45.5MB
    static int[] numbersOfDays = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};

    static {
        for (int i = 1; i < numbersOfDays.length; i++) numbersOfDays[i] += numbersOfDays[i - 1];
    }

    public int dayOfYear(String date) {
        String[] d = date.split("-");
        int year = Integer.parseInt(d[0]), month = Integer.parseInt(d[1]) - 1, day = Integer.parseInt(d[2]);

        return LeapYear(year) && month > 1 ? numbersOfDays[month] + day + 1 : numbersOfDays[month] + day;
    }

    static boolean LeapYear(long year) {
        return ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
    }
}