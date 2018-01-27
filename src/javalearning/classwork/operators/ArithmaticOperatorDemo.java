/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.classwork.operators;

/**
 *
 * @author rahen
 */
public class ArithmaticOperatorDemo {
    public static void main(String []args){
        //declaration of datatype and variable = value//
        int a = 2;
        int b = 3;
        int c = 4; 
        System.out.println ("A+B =" + (a+b));
        System.out.println ("A-B =" + (a-b));
        System.out.println ("A*B =" + (a*b));
        System.out.println ("A/B =" + (a/b));
        //Using moduls //
        System.out.println ("reminder A%B =" +(a%b));
        //use of post fix//
        a= 10;
       
        System.out.println ("a++ =" +(a));
        System.out.println ("A++=" +(a++));
        System.out.println ("a++ =" +(a));
        // using prefix//
        a=20;
        ++a;
         System.out.println ("++a =" +(a));
         //decrement operator postfix //
         a=25;
         a--;
          System.out.println ("a-- =" +(a));
          System.out.println ("a-- =" +(a--));
          System.out.println ("a-- =" +(a--));
          //decrement operator prefix//
          a=26;
         
           System.out.println ("--a =" +(--a));
           //again
           a = 21;
           ++a;
           System.out.println(a);
           //agani
           a = 15;
           --a;
           System.out.println(a);
           //again
           a =21;
           System.out.println(++a);
           //aganin see
           a = 15;
           System.out.println(--a);
                   
         
           
         
        
        
        
        
    }
    
}
