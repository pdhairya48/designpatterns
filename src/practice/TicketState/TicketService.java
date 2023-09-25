package practice.TicketState;

public class TicketService {
    public Ticket createTicket(String description,User createdBy){
        return new Ticket(description,createdBy);
    }
    public void changeTicketState(Ticket toTransition,TicketState finalState,User user){
        TicketState oldState = toTransition.getTicketState();
        if(oldState.equals(TicketState.ANALYSIS)){
            if(finalState.equals(TicketState.IN_PROGRESS)){
                toTransition.setTicketState(TicketState.IN_PROGRESS);
                System.out.println("moved from analysis to in_progress : "+oldState+":::"+finalState);
            }
            else if(finalState.equals(TicketState.DONE)){
                toTransition.setTicketState(TicketState.DONE);

                System.out.println("moved from analysis to done : "+oldState+":::"+finalState);
            }
        }
        else if(oldState.equals(TicketState.IN_PROGRESS)){
            if(finalState.equals(TicketState.ANALYSIS)){
                toTransition.setTicketState(TicketState.ANALYSIS);

                System.out.println("moved from in_progress to analysis : "+oldState+":::"+finalState);
            }
            else if(finalState.equals(TicketState.DONE)){
                toTransition.setTicketState(TicketState.DONE);

                System.out.println("moved from  in_progress to done: "+oldState+":::"+finalState);
            }
        }
    }
}
