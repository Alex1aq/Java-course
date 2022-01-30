package Lesson.lesson8.entries;

public abstract class Employee {
    String name;
    String lastName;
    String dayOfBirth;
    int holydaysAlreadyTaken;
    Employee (String name, String lastName, String dayOfBirth, int holydaysAlreadyTaken){
        this.name = name;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.holydaysAlreadyTaken = holydaysAlreadyTaken;
    }
    Employee(String name, String lastName, String dayOfBirth) {
        this(name, lastName, dayOfBirth, 0);

    }
    abstract public void salaryReview (double newSalary);
}
