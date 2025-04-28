public class Student implements Unit {
    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void displayDetails() {
        System.out.println("\tStudent: " + name + "\n \t ID: " + studentId + "\n \t Tuition Fee: P" + tuitionFee + "\n");
    }

    @Override
    public int calculateStudentCount() {
        return 1;
    }

    @Override
    public double calculateBudget() {
        return -tuitionFee;
    }
}