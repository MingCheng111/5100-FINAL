/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Yuemei
 */
public class WorkOrder extends WorkRequest{

    private int orderTicketNumber;
    private Game concert;
    private Bar stadium;
    private FeedBack feedBack;
    
    
    public WorkOrder(){
        this.concert = new Game();
        this.stadium = new Bar();
        this.feedBack = new FeedBack();
        
     }

    public int getOrderTicketNumber() {
        return orderTicketNumber;
    }

    public void setOrderTicketNumber(int orderTicketNumber) {
        this.orderTicketNumber = orderTicketNumber;
    }

    public FeedBack getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(FeedBack feedBack) {
        this.feedBack = feedBack;
    }

    public Game getConcert() {
        return concert;
    }

    public void setConcert(Game concert) {
        this.concert = concert;
    }

    public Bar getStadium() {
        return stadium;
    }

    public void setStadium(Bar stadium) {
        this.stadium = stadium;
    }

    public int getOrderTotalPrice(){
        return orderTicketNumber * concert.getTicketPrice();
    }

    @Override
    public String toString() {
        return concert.getConcertName();
    }

    
}
