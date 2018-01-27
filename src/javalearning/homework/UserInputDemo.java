/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.homework;
import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int intVariable = scanner.nextInt ();
       System.out.println(intVariable);
       System.out.println("Enter Number" + intVariable);
       
       double doubleVariable = scanner.nextDouble();
       System.out.println("enter doubleNumber = " + doubleVariable);
    }
    
}
