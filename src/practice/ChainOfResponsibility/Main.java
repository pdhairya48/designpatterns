package practice.ChainOfResponsibility;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        LeaveApplication application = new LeaveApplication(LeaveApplication.Type.LOP, LocalDate.now(),
                LocalDate.now().minusDays(1));
        System.out.println(application);
        Director director = new Director(null);
        Employee projectLead = new ProjectLead(director);
        projectLead.processLeaveApplication(application);
        System.out.println(application.getStatus()+"::::"+application.getProcessedBy());
        System.out.println(application);

    }
}
