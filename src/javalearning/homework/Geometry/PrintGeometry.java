
package javalearning.homework.Geometry;

import java.util.Scanner ;
public class PrintGeometry {
    
    
    public static void main(String[]ages){ 
        Scanner scanner = new Scanner(System.in);// this class for user input.
        Geometry geometry = new Geometry(); //this is object
        
        System.out.println("Enter base number ");
        double b = scanner.nextDouble();
        
        System.out.println("Enter length number ");
        double l = scanner.nextDouble();
       
        double area = geometry.trangArea(b,l);
        
        System.out.println(area);
        
        System.out.println("Enter length number ");
        double length = scanner.nextDouble();
        
        System.out.println("Enter base number ");
        double base = scanner.nextDouble();
       
        double area2 = geometry.rectangArea(length,base);
        
        System.out.println("Reasult of Rectangle" +area2);
        
    
        
    }
    
    
}
