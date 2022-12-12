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
public class DecorationItem {
    private String decorationItemName;
    private int decorationItemPrice;

    public String getDecorationItemName() {
        return decorationItemName;
    }

    public void setDecorationItemName(String decorationItemName) {
        this.decorationItemName = decorationItemName;
    }

    public int getDecorationItemPrice() {
        return decorationItemPrice;
    }

    public void setDecorationItemPrice(int decorationItemPrice) {
        this.decorationItemPrice = decorationItemPrice;
    }
    
    @Override
    public String toString(){
        return decorationItemName;
    }
    
    
    
}
