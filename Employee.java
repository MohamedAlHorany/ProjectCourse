
package project.dat;

/**
 *
 * @author abo.dalal.laptop
 */
public abstract class Employee extends Person  {
  private String  address , email ;
  private int password ,phone_number;
  private double basicSalary , liveExpensive;

    public Employee(String address, String email, int password, int phone_number, double liveExpensive, double basicSalary, String name, int id) {
        super(name, id);
        this.address = address;
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
        this.liveExpensive = liveExpensive;
        this.basicSalary = basicSalary;
        
        
        
    }

    public Employee() {
    }

   
  

    @Override
    public String toString() {
        return super.toString() + ", address:" + this.address + ", email:" +this.email + ", password:" + this.password +", phone_number:" + this.phone_number + ", liveExpensive:"  +this.liveExpensive + ", basicSalary:" +this.basicSalary  ;
    }

    


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
  public abstract double getSalary();

    public double getLiveExpensive() {
        return this.basicSalary * 0.1 ;
    }

    public void setLiveExpensive(double liveExpensive) {
        this.liveExpensive = liveExpensive;
    }





 
  
  
}
