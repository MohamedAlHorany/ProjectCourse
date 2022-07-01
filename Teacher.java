/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.dat;

import static com.sun.javafx.animation.TickCalculation.sub;

/**
 *
 * @author abo.dalal.laptop
 */
public class Teacher extends Employee {
private int classNo;


  





    public Teacher(int classNo, String address, String email, int password, int phone_number, double liveExpensive, double basicSalary, String name, int id) {
        super(address, email, password, phone_number, liveExpensive, basicSalary, name, id);
        this.classNo = classNo;
    }

    public Teacher() {

    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() + ", classNo=" + this.classNo + '}';
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    @Override
    public double getSalary() {
    return super.getBasicSalary() + getLiveExpensive() + 20;
      
    }

}
