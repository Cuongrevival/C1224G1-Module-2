

public class NextDayCalculatorTest {
    public static String getNextDay(int day, int month, int year) {
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31) {
            day = 1;
            month++;
            return day + "-" + month + "-" + year;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            day = 1;
            month++;

            return day + "-" + month + "-" + year;
        } else if (month == 2) {
           boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeapYear) {
                if (day == 29) {
                    day = 1;
                    month++;
                }
            } else {
                if (day == 28) {
                    day = 1;
                    month++;
                }
            }
            return day + "-" + month + "-" + year;
        } else if (month == 12 && day == 31) {
            day = 1;
            month = 1;
            year++;
            return day + "-" + month + "-" + year;
        }
        return (day + 1) + "-" + month + "-" + year;
    }
}
