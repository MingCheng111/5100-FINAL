/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;


public class Game  {
    private int concertId;
    private String concertName;
    private String concertTime;
    private String city;
    private int ticketPrice;
    private ArrayList<FeedBack> comments;

    private static int count = 101;
    
    public Game() {
        concertId = count;
        count++;
        comments = new ArrayList<>();
        
    }

    public int getConcertId() {
        return concertId;
    }

    public void setConcertId(int concertId) {
        this.concertId = concertId;
    }

    public String getConcertName() {
        return concertName;
    }

    public void setConcertName(String concertName) {
        this.concertName = concertName;
    }

    public String getConcertTime() {
        return concertTime;
    }

    public void setConcertTime(String concertTime) {
        this.concertTime = concertTime;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    
    public ArrayList<FeedBack> getComments() {
        return comments;
    }

    public void setComments(ArrayList<FeedBack> comments) {
        this.comments = comments;
    }
    
    public FeedBack addComments(FeedBack feedback){
        comments.add(feedback);
        return feedback;
    }
    
    public double getOverall(){
        double average = 0;
        for(FeedBack feedback:comments){
            average = average + feedback.getOverallSocre()/comments.size();
        }
        return average;
    }
    
    public double getFacility(){
        double average = 0;
        for(FeedBack feedback:comments){
            average = average + feedback.getSocreFacility()/comments.size();
        }
        return average;
    }
    
    public double getSecurity(){
        double average = 0;
        for(FeedBack feedback:comments){
            average = average + feedback.getScoreSecurity()/comments.size();
        }
        return average;
    }
    
    public double getService(){
        double average = 0;
        for(FeedBack feedback:comments){
            average = average + feedback.getScoreService()/comments.size();
        }
        return average;
    }
    
    public double getManage(){
        double average = 0;
        for(FeedBack feedback:comments){
            average = average + feedback.getScoreManage()/comments.size();
        }
        return average;
    }
 
    @Override
    public String toString() {
        return concertName;
    }
    
}
