/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class InventoryDirectory {
    
    public static ArrayList<Inventory> inventoryList = new ArrayList<>();
    private InventoryDirectory newInventoryList;
    
    static InventoryDirectory sddr= null;
    
    private InventoryDirectory(){
     Inventory st1 = new Inventory("001","Concert A", 10000,"Available","2021-12-24");
     Inventory st2 = new Inventory("002","Concert B", 20000,"Available","2022-01-13");
     Inventory st3 = new Inventory("003","Concert C", 2000,"Available","2022-04-25");
     Inventory st4 = new Inventory("004","Concert D", 8000,"Available","2022-07-06");
     
     inventoryList.add(st1);
     inventoryList.add(st2);
     inventoryList.add(st3);
     inventoryList.add(st4);
     
     
     }
    public static ArrayList<Inventory> getInventoryList(){
      
    if(sddr==null)
    {
     sddr = new InventoryDirectory();
    }
    return inventoryList;
      }

    public static void setInventoryList(ArrayList<Inventory> inventoryList) {
        InventoryDirectory.inventoryList = inventoryList;
    }
    
    public ArrayList<Inventory> getArrayUniqueList(){
      return inventoryList;
     }
    
}
