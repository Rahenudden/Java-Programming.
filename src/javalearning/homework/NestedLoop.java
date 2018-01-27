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
public class NestedLoop {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("outer loop running " + i);
            System.out.println("...............");
            for (int k = 15; k <= 20; k = k + 1) {
                System.out.println(k);
            }
        }     

    }
}                       
