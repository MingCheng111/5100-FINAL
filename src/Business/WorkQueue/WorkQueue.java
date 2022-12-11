/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;


public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<Bar> stadiumList;
    private ArrayList<DecorationItem> decorationItemList;
    private ArrayList<AdItem> adItemList;

    public WorkQueue() {
        workRequestList = new ArrayList();
        stadiumList = new ArrayList();
        decorationItemList = new ArrayList();
        adItemList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public ArrayList<Bar> getStadiumList() {        
        return stadiumList;
    }

    public ArrayList<DecorationItem> getDecorationItemList() {
        return decorationItemList;
    }

    public ArrayList<AdItem> getAdItemList() {
        return adItemList;
    }
    
 
   
}