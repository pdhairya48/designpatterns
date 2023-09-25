package practice.ChainOfResponsibility;

import java.time.LocalDate;


public class LeaveApplication {
    public enum Type {Sick, PTO, LOP};
    public enum Status {Pending, Approval, Rejected};
    private Type type;
    private LocalDate from;
    private LocalDate to;
    private String processedBy;
    private Status status;

    public Type getType() {
        return type;
    }

    public void setType(final Type type) {
        this.type = type;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(final LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(final LocalDate to) {
        this.to = to;
    }

    public String getProcessedBy() {
        return processedBy;
    }

    public void setProcessedBy(final String processedBy) {
        this.processedBy = processedBy;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(final Status status) {
        this.status = status;
    }

    public LeaveApplication(final Type type, final LocalDate from, final LocalDate to) {
        this.type = type;
        this.from = from;
        this.to = to;
        this.status=Status.Pending;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("LeaveApplication{");
        sb.append("type=").append(type);
        sb.append(", from=").append(from);
        sb.append(", to=").append(to);
        sb.append(", processedBy='").append(processedBy).append('\'');
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
