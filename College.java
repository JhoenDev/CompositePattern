import java.util.ArrayList;
import java.util.List;

public class College implements Unit {
    private String name;
    private List<Unit> units = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    @Override
    public void displayDetails() {
        System.out.println("College: " + name);
        for (Unit unit : units) {
            unit.displayDetails();
        }
    }

    @Override
    public int calculateStudentCount() {
        int count = 0;
        for (Unit unit : units) {
            count += unit.calculateStudentCount();
        }
        return count;
    }

    @Override
    public double calculateBudget() {
        double totalBudget = 0;
        for (Unit unit : units) {
            totalBudget += unit.calculateBudget();
        }
        return totalBudget;
    }
}