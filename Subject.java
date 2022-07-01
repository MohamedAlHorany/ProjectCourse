/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.dat;

import java.util.Objects;

/**
 *
 * @author abo.dalal.laptop
 */
public class Subject {
 private String Subject_name;
 Teacher[] Teacher ;
 Student[] Student ;
static int x = 1 ;
    public Subject(String Subject_name, Teacher[] Teacher, Student []Student) {
        this.Subject_name = Subject_name;
        this.Teacher = Teacher;
        this.Student = Student;
       
        
    }

    Subject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    

    
  public  int getCont(Subject n){
  if(this.Subject_name.equalsIgnoreCase(n.getSubject_name())){
  return x++;
  
  }else{
      x= x;
  
  }
     return x;
  
  }
    public String getSubject_name() {
        return Subject_name;
    }

    public void setSubject_name(String Subject_name) {
        this.Subject_name = Subject_name;
    }

    public project.dat.Teacher[] getTeacher() {
        return Teacher;
    }

    public void setTeacher(Teacher[] Teacher) {
        this.Teacher = Teacher;
    }

    public project.dat.Student[] getStudent() {
        return Student;
    }

    public void setStudent(Student []Student) {
        this.Student = Student;
    }

  

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Subject other = (Subject) obj;
        if (!Objects.equals(this.Subject_name, other.Subject_name)) {
            return false;
        }
        return true;
    }

   
    
    

    @Override
    public String toString() {
        return "Subject{" + " Subject_name=" + Subject_name + ", Teacher=" + Teacher + ", Student=" + Student + '}';
    }
 
}
