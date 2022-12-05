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
        TicketSales("TicketSales"),
        StadiumAd("Stadium Ad"),
        StadiumDesigner("Stadium Designer"),
        AfterSales("AfterSales"),
        
        ConcertManager("Concert Manager"),
        
        DecorationManager("Decoration Manager"),
        
        AdvertisementManager("Advertisement Manager"),
        
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
