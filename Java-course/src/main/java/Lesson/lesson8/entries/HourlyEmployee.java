package Lesson.lesson8.entries;

public class HourlyEmployee extends Employee{
    double payPerHour;
//20:27
    HourlyEmployee(String name, String lastName, String dayOfBirth, int holydaysAlreadyTaken) {
        super(name, lastName, dayOfBirth, holydaysAlreadyTaken);
    }

    @Override
    public void salaryReview(double newSalary) {

    }
}
