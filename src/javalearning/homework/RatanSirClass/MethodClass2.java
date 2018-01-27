
package javalearning.homework.RatanSirClass;


public class MethodClass2 {
    
    void m1 ( int a, char ch) // local variable 
    {
       System.out.println(a);
       System.out.println(ch); 
    }
    
    static void m2( String s , double d)// local variable 
    {
       System.out.println(s); 
       System.out.println(d);
    }
    
    public static void main(String[] agrs )
    {
        MethodClass2 m = new MethodClass2();
        m.m1(10,'R');
        MethodClass2.m2("Rahen", 12.5);
        
    }
    
}
