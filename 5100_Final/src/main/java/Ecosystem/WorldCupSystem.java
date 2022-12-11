/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecosystem;

import Enterprise.EnterpriseDirectory;
import UerAccount.UserAccountDirectory;

/**
 *
 * @author JINLANG
 */
public class WorldCupSystem {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;

    public WorldCupSystem() {
        enterpriseDirectory = new EnterpriseDirectory();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    @Override
    public String toString() {
        return name;
    }
   
    
}
