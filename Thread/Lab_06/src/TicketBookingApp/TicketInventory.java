package TicketBookingApp;

public class TicketInventory {
    private int stock;

    public TicketInventory(int stock) {
        this.stock = stock;
        System.out.println("avilble stock = "+getStock());
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public synchronized void booking(String name, int count){
        if(getStock() >= count){
            System.out.println(name+" Booking "+count+" tickets..");
            setStock(getStock()-count);
        }else{
            System.out.println("No ticket in stock: (stock: "+getStock()+")");
        }

    }
}
