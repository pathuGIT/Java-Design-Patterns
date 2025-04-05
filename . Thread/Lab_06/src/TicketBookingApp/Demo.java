package TicketBookingApp;

public class Demo {
    public static void main(String[] args) {
        TicketInventory ticketInventory = new TicketInventory(5);

        Thread user1 = new Ticket(ticketInventory,"Saman", 1);
        Thread user2 = new Ticket(ticketInventory,"Kamal", 2);
        Thread user3 = new Ticket(ticketInventory,"Namal", 3);

        user1.start();
        user2.start();
        user3.start();

        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Now available ticket in stock: (stock: "+ticketInventory.getStock()+")");

    }
}
