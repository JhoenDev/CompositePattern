import java.util.ArrayList;
import java.util.List;

public class Department implements Unit {
    private String name;
    private List<Unit> units = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    @Override
    public void displayDetails() {
        System.out.println("Department: " + name);
        for (Unit unit : units) {
            unit.displayDetails();
        }
    }

    @Override
    public int getStudentCount() {
        int count = 0;
        for (Unit unit : units) {
            count += unit.getStudentCount();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double totalBudget = 0;
        for (Unit unit : units) {
            totalBudget += unit.getBudget();
        }
        return totalBudget;
    }
}