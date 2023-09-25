package practice.TicketState;

public class Analysis implements State{

    @Override public boolean startAnalysis(final Ticket ticket, final User user) {
        return false;
    }

    @Override public boolean startReview(final Ticket ticket, final User user) {
        return false;
    }

    @Override public boolean markDone(final Ticket ticket, final User user) {
        return false;
    }
}
