/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

/**
 *
 * @author JINLANG
 */
class Lottery {
    private GameType gameType;
    private String hostTeam;
    private double hostCapitalPool;
    private String visitTeam;
    private double visitCapitalPool;
    private double initialOdds;//host / visit;
    
    public enum GameType{
        
        GroupMatches("GroupMatches"),
        SemiFinal("SemiFinal"),
        FinalMatche("FinalMatche");
        
        
        private String type;
        
        private GameType(String type){
            this.type = type;
        }
        public String getType() {
        return type;
        }

        @Override
        public String toString() {
        return type;
        }
    } 

    public Lottery(GameType gameType, String hostTeam, String visitTeam, double initialOdds) {
        this.gameType = gameType;
        this.hostTeam = hostTeam;
        this.visitTeam = visitTeam;
        this.initialOdds = initialOdds;
    }
    
    
    
}
