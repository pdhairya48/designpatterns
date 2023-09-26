package practice.VisitorPattern;

public class PrintVisitor implements Visitor{
    @Override public void visit(final Programmer programmer) {
        String msg = programmer.getName() + "is a " + programmer.getSkills()+" programmer. ";
        System.out.println(msg);
    }

    @Override public void visit(final ProjectLead projectLead) {
        String msg = projectLead.getName() + "is a project lead" + projectLead.getDirectReports().size();
        System.out.println(msg);
    }

    @Override public void visit(final Managers manager) {
        String msg = manager.getName();
        System.out.print(msg+"::");
        manager.getDirectReports().forEach(reports -> System.out.print(reports.getEmployeeId()));
        System.out.println("\n");
    }

    @Override public void visit(final VicePresident vicePresident) {
        System.out.println(vicePresident.getName() + " Vice President Visitor");
    }
}
