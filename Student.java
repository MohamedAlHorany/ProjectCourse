/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.dat;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abo.dalal.laptop
 */
public class Student extends Person {
private int level;
  static ArrayList<Student> student = new ArrayList<>();
 
     
    
    

    public Student(int level, String name, int id) {
        super(name, id);
        this.level = level;
    }

    public Student() {
        
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + ", level=" + level + '}';
    }

    Student getId(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    


    

   

   


}
