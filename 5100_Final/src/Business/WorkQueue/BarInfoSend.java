/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author ke
 */
public class BarInfoSend extends WorkSend{
    private String sendResult;
    private ArrayList<Bar> stadiumList;
    private ArrayList<Bar> suppStadiiumList;

    public ArrayList<Bar> getSuppStadiiumList() {
        return suppStadiiumList;
    }

    public void setSuppStadiiumList(ArrayList<Bar> suppStadiiumList) {
        this.suppStadiiumList = suppStadiiumList;
    }
    
    public BarInfoSend(){
       super();
       this.stadiumList= new ArrayList<>();
       this.suppStadiiumList=new ArrayList<>();
     }

    public String getSendResult() {
        return sendResult;
    }

    public void setSendResult(String sendResult) {
        this.sendResult = sendResult;
    }

//    public ArrayList<Request> getStadiumList() {
//        return stadiumList;
//    }
//
//    public void setStadiumList(ArrayList<Request> stadiumList) {
//        this.stadiumList = stadiumList;
//    }
//    
    
}
