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
public class Audience  {

    private String audienceName;
    
    public Audience() {
      
    }

    public String getAudienceName() {
        return audienceName;
    }

    public void setAudienceName(String audienceName) {
        this.audienceName = audienceName;
    }

    

   
    @Override
    public String toString() {
        return audienceName;
    }
    
}
