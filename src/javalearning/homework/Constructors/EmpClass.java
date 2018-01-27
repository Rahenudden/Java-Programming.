
package javalearning.homework.Constructors;


public class EmpClass {
    
    int eid;
    String ename;
    float esal;
   void emp ()
    {
       eid = 011;
       ename = "Karim";
       esal = 1200.2f;
       System.out.println ( "eid no "+ 001);
       System.out.println ( "ename no "+ "karim");
       System.out.println ( "esal no "+ 1200.2f);
    }
   
  public static void main(String[]agr)
  {
      EmpClass e = new EmpClass();
      e.emp();
  }
    
    
}
