
package javalearning.homework;


public class MethodExample {
    int Emp_id = 1; 
    String Emp_name ="Rahen";
    double Emp_salary = 1200.0;
    int Phone_no = 123112452;
    int bonous = 100; 
    int a =120;
    int b=50;
    
    void m1 ()
    {
        System.out.println("Print Emp_id = "+ Emp_id);
        System.out.println("Print Emp_name = "+ Emp_name);
        
       
    }
    void m2 ()
    {
      
        System.out.println("Print Phone_no = "+ Phone_no);
        System.out.println("Print bonous = "+ bonous);  
    }
    
    public double m3()
    {
        double Emp_salary = 1200.0;
        int bonous = 100;
        double sum = Emp_salary +bonous;
        System.out.println( "Total salary = " +sum);
        return sum ;
    }
    public double m4 ()
    {
       double Emp_salary = 500.2;
       int bonous = 100;
       double multiply = Emp_salary * bonous;
        System.out.println( "Total salary = " +multiply);
       
       return multiply;
    }
    
   public int m5 ()
   {
    int a = 120;
    int b = 50;
    int sum2 = a+b;
     System.out.println( "Total salary = " + sum2);
    return sum2;
   
   }
    
    
    public static void main(String []agrs)
    {
        MethodExample method = new MethodExample();
        method.m1();
        method.m2();
        method.m3( );
        method.m4( );
        method.m5( );
      
       
    }
    
    
}
