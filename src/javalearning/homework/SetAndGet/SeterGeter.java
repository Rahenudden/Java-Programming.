
package javalearning.homework.SetAndGet;
public class SeterGeter {
   
    private String name; 
    private String eid;
    
    public SeterGeter ()// default constructor 
    {
    }
    
    public SeterGeter(  String name, String eid)// parameterized constructor.
    {
      this.name = name;
      this.eid = eid;
    }
    
    public void students(String name)//This is method
    {
       this.name = name ;
       //System.out.println("Rahen");
    }
    public void teachers(String eid) // This is method 
    {
       this.eid = eid ;
        //System.out.println("100");
    }
    public void print ()// This is method 
    {
        System.out.println("{students = " + name + ",Teachers id = " + eid + '}'); // This } paranthesis is character.
    }
    public static void main(String[]args)
    {
      SeterGeter setergeter = new SeterGeter();  
      setergeter.print();
      System.out.println(".................");
      
     setergeter.students("Rahen");
     setergeter.teachers("100");
     setergeter.print();
     
     
    }
    
    
    
    
    
    
            
    
    
}
