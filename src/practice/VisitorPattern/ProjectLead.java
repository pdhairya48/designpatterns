package practice.VisitorPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class ProjectLead extends AbstractEmployee{

    private List<Employee> directReports = new ArrayList<>();

    public ProjectLead(final String name, Employee... employees) {
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
