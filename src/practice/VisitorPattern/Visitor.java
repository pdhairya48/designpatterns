package practice.VisitorPattern;

public interface Visitor {
    void visit(Programmer programmer);
    void visit(ProjectLead projectLead);
    void visit(Managers manager);
    void visit(VicePresident vicePresident);
}
