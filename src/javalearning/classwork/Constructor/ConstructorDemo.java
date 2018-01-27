
package javalearning.classwork.Constructor;


public class ConstructorDemo {
    int number; // instance variable this variable have to declar after class.
    String name;  // instance variable 
    
    public ConstructorDemo (){  // this is default constructor .
   
    }
      public ConstructorDemo (int number , String name  ){// this (int number, String name ) two local variable and this is
          // parametrized constructor
          this.number = number; // Formula:-  This.instance variable = parameterized variable
          this.name = name ;
    }   
      
    public void print(){ // this is main method
        System.out.println(number );
        System.out.println(name );  
      
    
    }
    
   
}
