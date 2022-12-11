/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author 
 */
public class Bar {
    private int stadiumID;
    private String stadiumName;
    private int stadiumSeat;
    private int stadiumPrice;
    private String stadiumCity;
    private String stadiumAddress;
    
    private static int count = 300;
    
    public Bar(){
        stadiumID = count;
        count++;
    }

    public int getStadiumID() {
        return stadiumID;
    }

    public void setStadiumID(int stadiumID) {
        this.stadiumID = stadiumID;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public int getStadiumSeat() {
        return stadiumSeat;
    }

    public void setStadiumSeat(int stadiumSeat) {
        this.stadiumSeat = stadiumSeat;
    }

    public int getStadiumPrice() {
        return stadiumPrice;
    }

    public void setStadiumPrice(int stadiumPrice) {
        this.stadiumPrice = stadiumPrice;
    }

    public String getStadiumCity() {
        return stadiumCity;
    }

    public void setStadiumCity(String stadiumCity) {
        this.stadiumCity = stadiumCity;
    }

    public String getStadiumAddress() {
        return stadiumAddress;
    }

    public void setStadiumAddress(String stadiumAddress) {
        this.stadiumAddress = stadiumAddress;
    }
    
    @Override
    public String toString(){
        return this.stadiumName;
    }
    
    
}
