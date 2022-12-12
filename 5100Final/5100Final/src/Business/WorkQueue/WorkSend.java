/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Enterprise.CheerAgency;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Yuemei
 */
public class WorkSend extends WorkRequest{
     

    private Game concert;
    private Bar stadium;
    private ArrayList<DecorationItem> chooseDecorationList;
    private ArrayList<AdItem> chooseAdList;
    
    
    public WorkSend(){
        this.concert = new Game();
        this.stadium = new Bar();
        this.chooseDecorationList = new ArrayList();
        this.chooseAdList = new ArrayList();
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

    public String getChooseDecorationList() {
        String d = "";
        for(DecorationItem a : chooseDecorationList){
            d = d + " " + a.getDecorationItemName();
        }
        return d;
    }

    public String getChooseAdList() {
        String d = "";
        for(AdItem a : chooseAdList){
            d = d + " " + a.getAdItemName();
        }
        return d;
    }



    public void setChooseDecorationList(ArrayList<DecorationItem> chooseDecorationList) {
        this.chooseDecorationList = chooseDecorationList;
    }

    public void setChooseAdList(ArrayList<AdItem> chooseAdList) {
        this.chooseAdList = chooseAdList;
    }
    
    

     public int getDecorationCost() {
        int decorationCost = 0;
        for(DecorationItem d : chooseDecorationList){
            decorationCost = decorationCost + d.getDecorationItemPrice();
        }
        return decorationCost;
    }
     
     public int getAdProfit() {
        int adProfit = 0;
        for(AdItem ad : chooseAdList){
            adProfit = adProfit + ad.getAdItemPrice();
        }
        return adProfit;
    }
     


    
    @Override
    public String toString() {
        return concert.getConcertName();
    }

    
}
