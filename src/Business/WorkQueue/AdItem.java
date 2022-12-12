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
public class AdItem {
    
    private String adItemName;
    private int adItemPrice;

    public String getAdItemName() {
        return adItemName;
    }

    public void setAdItemName(String adItemName) {
        this.adItemName = adItemName;
    }

    public int getAdItemPrice() {
        return adItemPrice;
    }

    public void setAdItemPrice(int adItemPrice) {
        this.adItemPrice = adItemPrice;
    }
    
    @Override
    public String toString(){
        return adItemName;
    }
    
    
}
