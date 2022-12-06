/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

/**
 *
 * @author JINLANG
 */
public abstract class Role {
    public enum RoleType{
        SystemAdmin("SystemAdmin"),
        
        StadiumAssign("Stadium Assign"),        
        StadiumManager("Stadium Manager"),
        
                
        TicketSales("TicketSales"),
        AfterSales("AfterSales"),
        
        PlanningManager("Planning Manager"),
        
        LotteryManager("LotteryManager"),
        
        AdvertisingManager("Advertising Manager"),
        
        Audience("Audience");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
