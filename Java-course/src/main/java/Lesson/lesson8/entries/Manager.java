package Lesson.lesson8.entries;

public class Manager extends Employee {
    Manager(String name, String lastName, String dayOfBirth, int holydaysAlreadyTaken) {
        super(name, lastName, dayOfBirth, holydaysAlreadyTaken);
        this.projectSide =projectSide ;
    }

    @Override
    public void salaryReview(double newSalary) {

    }

    String projectSide;
    double salary;
}
