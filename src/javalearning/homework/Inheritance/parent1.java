
package javalearning.homework.Inheritance;

 class parent1 
{   
     parent1() 
    { 
    System.out.println("parent method");
    }            
}
class child1 extends parent1
{ 
    child1()
    {
    System.out.println("child method");
    }
 
}

public static void main(String[]args)
{
    new child1();
}


