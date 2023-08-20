package TicketState;

public class Client {
    public static void main(String[] args) {
        User u1 = new User("u1");
        Ticket ticket = new Ticket("first ticket",u1);
        TicketService ticketService = new TicketService();
        ticketService.changeTicketState(ticket,TicketState.IN_PROGRESS,u1);
        ticketService.changeTicketState(ticket,TicketState.DONE,u1);

    }
}
