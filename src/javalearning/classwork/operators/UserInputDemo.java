/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.classwork.operators;
import java.util.Scanner;

/**
 *
 * @author rahen
 */
public class UserInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter first interger number ");
        System.out.println ("..............");
        int intVariable= scanner.nextInt();
        System.out.println ("enter number" + intVariable);
        System.out.println ("enter double number ");
        double doubleVariable = scanner.nextDouble(); 
         System.out.println (".................... ");
         
         System.out.println( "enter string");
         String stringVariable = scanner.next();
         System.out.println("enter number" + stringVariable);
         
        
    }
    
}
