/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

/**
 *
 * @author JINLANG
 */
public class Feedback {
    private String comment;
    private int scoreService;
    private int scoreManage;
    private int socreFacility;
    private int scoreSecurity;
    private int overallSocre;

  
    public Feedback(){
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
