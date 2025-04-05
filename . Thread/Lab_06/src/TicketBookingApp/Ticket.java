package TicketBookingApp;

public class Ticket extends Thread {
    private String name;
    private TicketInventory ticketInventory;
    private int count;

    public Ticket(TicketInventory ticketInventory, String name, int count) {
        this.name = name;
        this.ticketInventory = ticketInventory;
        this.count = count;
    }

    @Override
    public void run() {
        ticketInventory.booking(name, count);
    }
}
