package practice.ChainOfResponsibility;

public interface LeaveApprove {

    String getApproverRole();
    void processLeaveApplication(LeaveApplication leaveApplication);

}
