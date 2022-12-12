/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author Yuemei
 */
public class Inventory {
    
    private String concertID;
    private String concertName;
    private int concertSeat;
    private String availability;
    private String concertTime;
    
  
    
    private static Date date= new Date();

    public static Date getDate() {
        return date;
    }

    public static void setDate(Date date) {
        Inventory.date = date;
    }
    

    public Inventory(String concertID, String concertName, int concertSeat, String availability,String concertTime) {
        //To change body of generated methods, choose Tools | Templates.
        this.concertID=concertID;
        this.concertName=concertName;
        this.concertSeat= concertSeat;
        this.availability=availability;
        this.concertTime=concertTime;
        
        
    }



    public String getConcertID() {
        return concertID;
    }

    public void setConcertID(String concertID) {
        this.concertID = concertID;
    }

    public String getConcertName() {
        return concertName;
    }

    public void setConcertName(String concertName) {
        this.concertName = concertName;
    }

    public int getConcertSeat() {
        return concertSeat;
    }

    public void setConcertSeat(int concertSeat) {
        this.concertSeat = concertSeat;
    }

   
    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getConcertTime() {
        return concertTime;
    }

    public void setConcertTime(String concertTime) {
        this.concertTime = concertTime;
    }

  

    @Override
    public String toString() {
        return  this.concertID;
    }
    
    
}
