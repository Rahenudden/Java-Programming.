/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.homework;

/**
 *
 * @author rahen
 */
public class BreakStatement {
    public static void main(String[] args) {
        int i =1;
        while (i<= 10){
            System.out.println(i);
            i= i +1;
            if (i == 11){
                break;
            }
        }// Here while condition is true so it will print the value of i//
    }
}
