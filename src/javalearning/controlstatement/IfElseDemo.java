/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.controlstatement;

/**
 *
 * @author rahen
 */
public class IfElseDemo {
    public static void main (String [] args){
        int mark =110;
        /*
        if(condition){
            Statements;
        }else if(condition){
            Statements;
        }else{
            Statements;
        }
        
        */
        if(mark >=90 && mark <= 100 ){
            System.out.println("A+");
            
        }else if (mark >=80 && mark <=89){
            System.out.println("A");
        }else if ( mark >=70 && mark <= 79){
            System.out.println("A-");
            
        }else if (mark >=60 && mark <=69){
            System.out.println("B");
        }else if (mark >=0 && mark <=59){
            System.out.println("F");
        }else {
            System.out.println("Invalid");
        }
    }
    
}
