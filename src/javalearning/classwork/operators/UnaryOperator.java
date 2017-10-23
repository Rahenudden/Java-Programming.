/* Unary Operator
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.classwork.operators;

/**
 *
 * @author rahen
 */
public class UnaryOperator {
    public static void main(String [] agrs){
        int x=12;
        //Postfix Operator ++
        System.out.println(x++);
        System.out.println(x);//
        //Prefix Operator ++
        System.out.println(++x);
        
        //Prefix Operator -- (Minus
        System.out.println(--x);
        //Postfix Operator --
        System.out.println(x--);
        System.out.println(x);
        
    }
    
}
