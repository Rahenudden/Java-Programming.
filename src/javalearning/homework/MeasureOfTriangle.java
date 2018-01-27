
package javalearning.homework;

import java.util.Scanner;
public class MeasureOfTriangle {
    public static void main(String[]agrs){
         Scanner s = new Scanner (System.in); 
         
         System.out.println("Enter the number of width");
         double w = s.nextDouble();
         
         System.out.println("Enter the number of base");
          double b = s.nextDouble();
          
         double area = (w*b)/2;
          System.out.println("Area of Triangle is " + area);
          
    
    }
    
}
