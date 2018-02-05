
package javalearning.homework;

import java.util.Scanner;
public class Array {
    public static void main (String [] agrs){
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter my friens number");
    int number ;
    number = scan.nextInt();
    
    String [] names = new String [number];
  
    for ( int counter = 0; counter <number; counter++)
    {
       System.out.println("Enter friends name "+(counter+1));
       names [counter]= scan.next();
    }
    
    
   
}
}