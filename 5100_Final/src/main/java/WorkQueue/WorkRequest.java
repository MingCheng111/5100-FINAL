/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

import UerAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author JINLANG
 */
public abstract class WorkRequest {
    private UserAccount sender;
    private UserAccount receiver;
    private Status status;
    private Date requestDate;
    private Date completeDate;
    
    
    public enum Status {
    Started("Started"),
    Accept("Accept"),
    Refuse("Refuse"),
    
    BookStadium("Book Stadium"),
    StadiumAccept("Stadium Accept"),
    StadiumRefuse("Stadium Refuse"),
    
    
    Decorating("Decorating"),
    DecorationAccept("Decoration Accept"),
    DecorationRefuse("Decoration Refuse"),
    

    
    Ad("Advertising"),
    AdAccept("Ad Accept"),
    AdRefuse("Ad Refuse"),
    
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

    public WorkRequest() {
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }
    
}
