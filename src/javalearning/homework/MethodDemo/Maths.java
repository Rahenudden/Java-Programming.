
package javalearning.homework.MethodDemo;


public class Maths {
    
    public void ParameterizedMethod (int a, int b)
    {
        int i = a;
        int t = b;
        int result = a+b;
        System.out.println(result);
    }
    
    public int method(int number , int number1, int number2, int number3) // Here all are same data item.
    {
        return  number+number1+number2+number3;
      
    }
    
    public static void main (String[]args)
    {
      Maths math = new Maths();
      math.ParameterizedMethod(10,12); // This way have to call method
      
      System.out.println(math.method(12,6,5,8));// This way have to call return variable of Mathod.
    }
}