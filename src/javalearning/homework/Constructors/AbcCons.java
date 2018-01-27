
package javalearning.homework.Constructors;
public class AbcCons {
   
    AbcCons ( int number ,String name ) // This is parameterized constructor.
    {
        System.out.println("print two parameters");  
    }
    
    AbcCons ( ) // This is default constructor because in the parentheses has no variable.
    {
       System.out.println ("This is default constructor");
    } 
    AbcCons ( int id,  double salary, String name)// This is parameterized constructor.
    {
        System.out.println( "three parameterized cons");
    }
    void Abc( int a , double b)
    {
        System.out.println("Print method ");
    }        
        
    public static void main(String[]args)
    {
        AbcCons abccons = new AbcCons(12,"kabir");
        
        abccons.Abc(12, 12.60);  
       
    }
    
}
