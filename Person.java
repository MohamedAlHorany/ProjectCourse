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
public class Person {
  String name;
  private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "name:" + name + ", id:" + id ;
    }


  
}
