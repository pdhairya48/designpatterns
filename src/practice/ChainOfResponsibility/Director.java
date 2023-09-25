package practice.ChainOfResponsibility;

public class Director extends Employee{
    protected Director(final LeaveApprove successor) {
        super("Director", successor);
    }

    @Override protected boolean processRequest(final LeaveApplication leaveApplication) {
        if(leaveApplication.getType().equals(LeaveApplication.Type.PTO)){
            leaveApplication.setProcessedBy("Director");
            leaveApplication.setStatus(LeaveApplication.Status.Approval);
            return true;
        }
        return false;
    }
}
