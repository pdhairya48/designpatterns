package TicketState;

public class Ticket {
    private String description;
    private User createdBy;
    private TicketState ticketState;

    public Ticket(final String description, final User createdBy) {
        this.description = description;
        this.createdBy = createdBy;
        this.ticketState=TicketState.ANALYSIS;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(final User createdBy) {
        this.createdBy = createdBy;
    }

    public TicketState getTicketState() {
        return ticketState;
    }

    public void setTicketState(final TicketState ticketState) {
        this.ticketState = ticketState;
    }
}
