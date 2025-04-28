public class Teacher implements Unit {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        System.out.println("\tTeacher: " + name + "\n \t Subject: " + subject + "\n \t Salary: P" + salary + "\n");
    }

    @Override
    public int calculateStudentCount() {
        return 0;
    }

    @Override
    public double calculateBudget() {
        return salary;
    }
}