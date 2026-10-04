package aggregat.domain;

import java.util.ArrayList;
import java.util.List;

public class TicketInventory {
    public final List<Ticket> tickets = new ArrayList<>();

    public void addTickets(int number, String reservationName) {
        for (int i = 0; i < number; i++) {
            tickets.add(new Ticket(reservationName));
        }
    }

    boolean tryAddTickets(int maximumCapacity, int numberToAdd, String reservationName){
        if(maximumCapacity >= tickets.size() + numberToAdd)
           addNewTicket(numberToAdd, reservationName);
        return true;
    }

    public List<String> retrieveTicketByReservationName(String reservationName) {
        return tickets.stream()
                .filter(ticket -> ticket.hasReservationName(reservationName))
                .map(Ticket::getId).toList();
    }

    private void addNewTicket(int numberToAdd, String reservationName) {
        for (int i = 0; i < numberToAdd; i++) {
            tickets.add(new Ticket(reservationName));
        }
    }
}
