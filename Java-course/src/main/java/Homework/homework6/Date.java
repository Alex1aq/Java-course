package Homework.homework6;

public class Date {
    int day;
    int mouths;
    int year;

    public Date(int day, int mouths, int year) {
        this.day = day;
        this.mouths = mouths;
        this.year = year;

    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", mouths=" + mouths +
                ", year=" + year +
                '}';
    }
}
