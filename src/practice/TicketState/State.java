package practice.TicketState;

public interface State {
    boolean startAnalysis(Ticket ticket,User user);
    boolean startReview(Ticket ticket,User user);
    boolean markDone(Ticket ticket,User user);
}
