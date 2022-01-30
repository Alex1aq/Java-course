package Homework.homework6;

public class DateCalculator {
    public static void main(String[] args) {
        Date date1 = new Date(40, 1, 2022);
        Date date2 = new Date(25, 0, 2022);
        System.out.println("Number Of Days Between Two Date: " + Math.abs((calculateNumberOfDaysBetweenTwoDate(date1, date2))));
    }

    public static long calculateNumberOfDaysBetweenTwoDate(Date date1, Date date2) {
        long d1 = convertToDays(date1);
        long d2 = convertToDays(date2);
        return Math.abs(d1 - d2);
    }

    static long convertToDays(Date date) {
        int[] monthDaysArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int yearDays = date.getYear() * 365 + countLeapYears(date);
        int monthDays = 0;
        for (int i = 0; i < date.getMonth() - 1; i++) {
            monthDays += monthDaysArr[i];
        }
        return yearDays + monthDays + date.getDay();
    }

    static int countLeapYears(Date data) {
        int years = data.getYear();
        if (data.getDay() <= 1) {
            years--;
        }
        return (years - (years % 4)) / 4 - ((years - (years % 100)) / 100 - (years - (years % 400)) / 400);
//            while (year < 2999) {
//            year=+4;
//        }if (year == )
//            System.out.println(triple);
//        else
//            System.out.println("-1");
        //

    }


}
