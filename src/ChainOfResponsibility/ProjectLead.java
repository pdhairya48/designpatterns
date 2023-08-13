package ChainOfResponsibility;

public class ProjectLead extends Employee {

    protected ProjectLead(final LeaveApprove successor) {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(final LeaveApplication leaveApplication) {
        if(leaveApplication.getType() == LeaveApplication.Type.Sick){
            leaveApplication.setProcessedBy("Project Lead");
            leaveApplication.setStatus(LeaveApplication.Status.Approval);
            return true;
        }
        return false;
    }
}
