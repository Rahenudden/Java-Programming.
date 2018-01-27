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
public class IfElseDemo {

    public static void main(String[] args) {
        int number = 10;
        int rem = number % 2;
        if (rem == 1) {
            System.out.println(number + " = Odd Number");
        } else {
            System.out.println(number + " = even Number");

        }
        number = 21;
        rem = number % 2;
        if (rem == 1) {
            System.out.println("odd Number");
        }

    }

}
