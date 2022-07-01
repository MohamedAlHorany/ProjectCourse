/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.dat;

/**
 *
 * @author abo.dalal.laptop
 */
public class Manager extends Employee {

   private Double managerBonus;

    public Manager(Double managerBonus, String address, String email, int password, int phone_number, double liveExpensive, double basicSalary, String name, int id) {
        super(address, email, password, phone_number, liveExpensive, basicSalary, name, id);
        this.managerBonus = managerBonus;
    }

    public Manager() {
    }

    Manager(double d, String gaza, String wwwgmailcom, int i, int i0, int i1, String mohammed, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   

    public Double getManagerBonus() {
        return managerBonus;
    }

    public void setManagerBonus(Double managerBonus) {
        this.managerBonus = managerBonus;
    }

    @Override
    public double getSalary() {
       return  super.getBasicSalary() + super.getLiveExpensive() + managerBonus;
        
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() + ", managerBonus=" + managerBonus + '}';
    }

    
    
}
