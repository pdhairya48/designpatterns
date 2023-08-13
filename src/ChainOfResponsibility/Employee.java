package ChainOfResponsibility;

public abstract class Employee implements LeaveApprove{

    String role;

    private LeaveApprove successor;

    protected Employee(final String role,final LeaveApprove successor) {
        this.role = role;
        this.successor=successor;
    }

    @Override
    public String getApproverRole() {
        return role;
    }

    @Override
    public void processLeaveApplication(final LeaveApplication leaveApplication) {
        if(!processRequest(leaveApplication) && successor!=null){
            successor.processLeaveApplication(leaveApplication);
        }

    }
    protected abstract boolean processRequest(LeaveApplication leaveApplication);

}
