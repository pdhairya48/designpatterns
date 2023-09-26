package practice.VisitorPattern;

public class Client {
    public static void main(String[] args) {
        Employee emps = buildOrganization();
        Visitor visitor = new PrintVisitor();
        visitOrgStructure(emps,visitor);
    }

    private static void visitOrgStructure(Employee emp, Visitor vis ){
        if(emp==null) return ;
        emp.accept(vis);
        emp.getDirectReports().forEach(employee -> visitOrgStructure(employee,vis));
    }

    private static Employee buildOrganization(){
        Programmer p1 = new Programmer("Rachel","C++");
        Programmer p2 = new Programmer("Andy","Java");

        Programmer p3 = new Programmer("Josh","Golang");
        Programmer p4 = new Programmer("bill","C#");

        ProjectLead pl1=new ProjectLead("Tine", p1 , p2);
        ProjectLead pl2=new ProjectLead("Joey", p4 , p3);

        Managers m1 = new Managers("manager 1", pl1);
        Managers m2 = new Managers("manager 2", pl2);

        VicePresident vp = new VicePresident("Richard", m1, m2);

        return vp;

    }
}
