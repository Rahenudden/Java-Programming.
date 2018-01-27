
package javalearning.homework;


public class MethodInstanceObject {
    
    int eid; 
    String ename;
    double salary;
    String p_number;
    
    void M_name ()
    {
    System.out.println ("Print eid" + eid);
      System.out.println ("Print salary" + salary);
        System.out.println ("Print p_number" + p_number);
    }
    
    public static void main (String []args)
    {
    MethodInstanceObject object = new MethodInstanceObject();// the word object is a object of class and its called also instance.
    object.eid = 1;
    object.ename = " Rahen";
    object.salary = 1200.2;
    object.p_number = "6315351148";
    
    object.M_name();
    
    }
    
}
