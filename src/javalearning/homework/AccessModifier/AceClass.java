
package javalearning.homework.AccessModifier;


public class AceClass {
    
   int number  ;
   double salary ; 
   String name;
   public AceClass (int number, double salary, String name)// this is constructor.
    {
        this.number = number;
        this.salary = salary;
        this.name=name;
    }
   
   public AceClass () // default constructor
   {
   
   }
   void publicclass () //this is method 
   {
       System.out.println(number);
       System.out.println(salary);
       System.out.println(name);
   }
   
   
    
}
