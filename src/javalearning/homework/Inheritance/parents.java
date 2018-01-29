
package javalearning.homework.Inheritance;


class parent 
{
    void m1(){System.out.println("Parnet m1 method");}
}
class child extends parent // create inheritace with parent class.
{
    void m1(){System.out.println("Print m2 method");}
    
    void m2 ()
    {
        System.out.println("print m2 method");
       this.m1();  // This is parents class m1 method.
       super.m1();  // This is child class m1 method.
    }
    public static void main(String []agrs)
    {
        new child ().m2 ();
    }  
   
}
   