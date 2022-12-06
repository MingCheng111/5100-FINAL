/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

/**
 *
 * @author JINLANG
 */
public class WorkOrder {
    private int orderID;
    private Planning planning;
    private StadiumInfo stadiumInfo;
    private Feedback feedback;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Planning getPlanning() {
        return planning;
    }

    public void setPlanning(Planning planning) {
        this.planning = planning;
    }

    public StadiumInfo getStadiumInfo() {
        return stadiumInfo;
    }

    public void setStadiumInfo(StadiumInfo stadiumInfo) {
        this.stadiumInfo = stadiumInfo;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public WorkOrder() {
    }
}
