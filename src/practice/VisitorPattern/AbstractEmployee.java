package practice.VisitorPattern;

import java.util.ArrayList;
import java.util.Collection;


public abstract class AbstractEmployee implements Employee{
    private int performanceRating;
    private String name;
    private static int employeeIdCounter = 101;

    private int employeeId;

    protected AbstractEmployee(final String name) {
        this.name = name;
    }

    @Override public int getPerformanceRating() {
        return 0;
    }

    @Override public void setPerformanceRating(final int rating) {

    }

    @Override public Collection<Employee> getDirectReports() {
        return new ArrayList<>();
    }

    @Override public int getEmployeeId() {
        return 0;
    }

    abstract public void accept(final Visitor visitor);

    public String getName() {
        return name;
    }

    public static int getEmployeeIdCounter() {
        return employeeIdCounter;
    }
}
