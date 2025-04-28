public class Main {
    public static void main(String[] args) {
        //students
        Student s1 = new Student("Jullien Jhoen Alban", "20-11672-618", 27000);
        Student s2 = new Student("Daryl Trisha Manampan", "20-9999-999", 28500);
        Student s3 = new Student("Keanu Paul Bangahon", "21-12345-67", 32000);

        //teachers
        Teacher t1 = new Teacher("Prof. Joey Alban", "Computer Science", 55000);
        Teacher t2 = new Teacher("Prof. Jerry Esperanza", "Software Engineering", 64000);

        //departments
        Department csDepartment = new Department("Computer Science Department");
        csDepartment.addUnit(t1);
        csDepartment.addUnit(s1);
        csDepartment.addUnit(s2);

        Department itDepartment = new Department("Information Technology Department");
        itDepartment.addUnit(t2);
        itDepartment.addUnit(s3);

        //college
        College engineeringCollege = new College("College of Informatics and Computing Studies");
        engineeringCollege.addUnit(csDepartment);
        engineeringCollege.addUnit(itDepartment);

        engineeringCollege.displayDetails();
        System.out.println("\nTotal Students: " + engineeringCollege.getStudentCount());
        System.out.println("Total Budget: $" + engineeringCollege.getBudget());
    }
}