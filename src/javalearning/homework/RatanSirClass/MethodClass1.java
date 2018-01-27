
package javalearning.homework.RatanSirClass;


public class MethodClass1 
{
      void m1()//Formula - Return type Method name (); // This is instance method
            
    {
        System.out.println( "This is my m1 method");
    }
    void m2 () // This is instance method
    {
        System.out.println("This is my m2 method");
    }
    static void m3 () //This is static method 
    {
        System.out.println("This is my m3 method ");
    }
    public static void main (String[]args)
    {
       MethodClass1 m = new MethodClass1();
        m.m1();
        m.m2();
        MethodClass1.m3(); // Here MethodClass1 is class name.
     
    }
}
