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
        Department csDep = new Department("Computer Science Department");
        csDep.addUnit(t1);
        csDep.addUnit(s1);
        csDep.addUnit(s2);

        Department itDep = new Department("Information Technology Department");
        itDep.addUnit(t2);
        itDep.addUnit(s3);

        //college
        College collegeCICS = new College("College of Informatics and Computing Studies");
        collegeCICS.addUnit(csDep);
        collegeCICS.addUnit(itDep);

        collegeCICS.displayDetails();
        System.out.println("\nTotal Students: " + collegeCICS.calculateStudentCount());
        System.out.println("Total Budget: P" + collegeCICS.calculateBudget());
    }
}