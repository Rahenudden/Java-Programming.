// Default constructor 
package javalearning.homework;


public class ConstrucoreExample {
    
   int eid ;
    String ename;
    int phone_no ;
    double salary ;
   public ConstrucoreExample (int eid, String ename, int phone_no, double salary) // this is constructor.
   {
       this.eid=eid;   //  we have to initialized vabiable here in parameterized constructor and without this initialize , print will not work.
       
       this.ename=ename;   //  we have to initialized vabiable here in parameterized constructor and without this initialize , print will not work.
       this.phone_no = phone_no;  //  we have to initialized vabiable here in parameterized constructor and without this initialize , print will not work.
       this.salary = salary;   //  we have to initialized vabiable here in parameterized constructor and without this initialize , print will not work.
   
   }
   
   void putData()// this is method.
   {
       System.out.println("Print eid ="+ eid);
       System.out.println("Print ename ="+ ename);
       System.out.println("Print phone_no ="+ phone_no);
       System.out.println("Print salary ="+ salary );
   }
    
   public static void main(String[]agrs) //This is main method.
   
  {
  ConstrucoreExample constructor = new ConstrucoreExample(10,"Rahen", 101234,123.10);
  constructor . putData();
  
 
  

  
  
  
  
  }
}
