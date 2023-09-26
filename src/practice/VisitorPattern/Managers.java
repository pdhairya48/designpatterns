package practice.VisitorPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class Managers extends AbstractEmployee{

    private List<Employee> directReports = new ArrayList<>();

    public Managers(final String name, Employee... employees) {
        super(name);
        directReports.addAll(Arrays.asList(employees));
    }

    @Override public Collection<Employee> getDirectReports() {
        return directReports;
    }
    @Override public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}

