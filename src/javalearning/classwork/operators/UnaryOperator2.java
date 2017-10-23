/*Unary operator 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.classwork.operators;

/**
 *
 * @author rahen
 */
public class UnaryOperator2 {
    public static void main(String [] args){
        int x= 15;
        /*
        * 15 + 17
        *  x=16
        */
        System.out.println(x++ + ++x);
        x=20;
        System.out.println(x-- + --x);
        x=4;
        System.out.println(x-- * --x);
        x=4;
         System.out.println(x-- / --x);
    }
    
}
