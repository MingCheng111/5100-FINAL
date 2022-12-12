/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Jinlang
 */
public class FeedBack {
    private String comment;
    private int scoreService;
    private int scoreManage;
    private int socreFacility;
    private int scoreSecurity;
    private int overallSocre;

  
    public FeedBack(){
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getScoreService() {
        return scoreService;
    }

    public void setScoreService(int scoreService) {
        this.scoreService = scoreService;
    }

    public int getScoreManage() {
        return scoreManage;
    }

    public void setScoreManage(int scoreManage) {
        this.scoreManage = scoreManage;
    }

    public int getSocreFacility() {
        return socreFacility;
    }

    public void setSocreFacility(int socreFacility) {
        this.socreFacility = socreFacility;
    }

    public int getScoreSecurity() {
        return scoreSecurity;
    }

    public void setScoreSecurity(int scoreSecurity) {
        this.scoreSecurity = scoreSecurity;
    }

    public int getOverallSocre() {
        return overallSocre;
    }

    public void setOverallSocre(int overallSocre) {
        this.overallSocre = overallSocre;
    }

   
    
    
    
    
}
