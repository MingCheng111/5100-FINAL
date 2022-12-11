/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

/**
 *
 * @author JINLANG
 */
public class GameSchedule {
    private String gameDescrible;
    private int gameID;
    private int seatsNumber;
    private String date;

    public GameSchedule() {
    }

    public String getGameDescrible() {
        return gameDescrible;
    }

    public void setGameDescrible(String gameDescrible) {
        this.gameDescrible = gameDescrible;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
