/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


/**
 *
 * @author Yuemei
 */
public enum Status {
    Started("Started"),
    Accept("Accept"),
    Refuse("Refuse"),
    
    BookBar("Book Bar"),
    BarAccept("Bar Accept"),
    BarRefuse("Bar Refuse"),
    
    
    Cheering("Cheering"),
    CheerAccept("Cheer Accept"),
    CheerRefuse("Cheer Refuse"),
    
    
    Prepared("Prepared"),
    SellTickets("Sell Tickets"),
    
    BuyTickets("Buy Tickets"),
    CheckOut("CheckOut"),
    
    Complete("Complete");

    private String value;

    private Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
