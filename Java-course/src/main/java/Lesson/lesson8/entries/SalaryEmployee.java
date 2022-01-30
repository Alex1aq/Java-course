package Lesson.lesson8.entries;

public class SalaryEmployee extends  Employee{
    double salary;

    SalaryEmployee(String name, String lastName, String dayOfBirth, int holydaysAlreadyTaken) {
        super(name, lastName, dayOfBirth, holydaysAlreadyTaken);
    }

    @Override
    public void salaryReview(double newSalary) {

    }
}
