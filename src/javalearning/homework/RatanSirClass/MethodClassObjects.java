// problem-3 for taking parameter as object.
package javalearning.homework.RatanSirClass;
class X{}
class Emp{}
class Dep{}
class Y{}
class student{}
public class MethodClassObjects {
    void m1 (X x , Emp e)
    {
        System.out.println(x);
        System.out.println(e);
    }
    
    void m2 (Y y, Dep d)
    {
        System.out.println(y);
        System.out.println(d );    
    }
    public static void main(String[]args)
    {
    MethodClassObjects  m = new MethodClassObjects ();
        X x = new X ();
        Emp e1 = new Emp ();
         m. m1(x ,e1 );
         
        Y y = new Y();
        Dep d = new Dep();
        m.m2(y, d );
  
    }
            
}
