/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.dat;

import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author abo.dalal.laptop
 */
public class School {

        static ArrayList<Subject> m = new ArrayList<Subject>();
    static Teacher[] y;
    static Student[] x;
    /**
     * @param args the command line arguments
     */    // int classNo, String address, String email, String password, int phone_number, int liveExpensive, double basicSalary, String name, int id
    public static void main(String[] args) {
       // TODO code application logic here
       ArrayList<Student> student = new ArrayList<>();
            Student n = new Student(1,"mohammed",12324564); ;
       student.add(n);
        Student[] x = new Student[5];
       
        x[1] = new Student( 1,"mohammed",12324564 );
        System.out.println(x[1].toString());
         y = new Teacher[2];
            int mn124hg;
        y[1] = new Teacher(2,"rerd","bng.com",54,1202152521,12,150.2,"mohammed",12451);
        System.out.println(y[1].toString());
        System.out.println(y[1].getSalary());
        Subject[] z = new Subject[6];
        z[0] = new Subject("math" ,y, x );
        System.out.println(z[0].x);
        System.out.println(z[0].toString());
        Manager c = new Manager(15.0,"rerd","bng.com",21,1202152521,12,150.2,"mohammed",12451);
        System.out.println(c.toString());
        System.out.println(c.getSalary());
        try {
        FileWriter fount = new FileWriter("test.txt");
        fount.write(c.getName() + c.getEmail() + c.getAddress() + c.getPassword() + c.getPhone_number() + n.getName() + n.getId() + n.getLevel() + y[1].getAddress() + y[1].getEmail() + y[1].getName()
        +y[1].getPassword() + y[1].getPhone_number() + z[0].getSubject_name() + z[0].getStudent() + z[0].Teacher  
         );
        fount.close();
    } catch (Exception ex) {
        
       
    }
        
        ArrayList<String> a  = new ArrayList<>();
        a.add("awwad");
       
    }
    
}
