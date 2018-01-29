
package javalearning.homework.get;


public class Get {

    private int Emp_id;
    private String Emp_name;
    private double phone_number;

    public Get() // default constructor 
    {
    }

    public Get(String Emp_name, int Emp_id, double phone_number ) 
    {
        this.Emp_name = Emp_name;
        this.Emp_id = Emp_id;
        this.phone_number = phone_number;
  
    }
    public void set1 (int Emp_id)
    {
        this.Emp_id = Emp_id;
    }
    public void set2 (String Emp_name)
    {
        this.Emp_name = Emp_name;
    }
    
    public  int get1  (int Emp_id) // formula of Get = public + Data type will be same as  variable type + mehod name. (No parameter)
    {
        return Emp_id ;
    }
     public String get2 (String Emp_name)
    {
        return Emp_name ;
    }

    public void print () 
    {
    System.out.println(Emp_id) ;
    System.out.println(Emp_name) ;
    
    }
    
   
            
    
}
