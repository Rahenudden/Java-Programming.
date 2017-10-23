/* Use of If and use of logical (&&= AND )operaore .
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.homework;

/**
 *
 * @author rahen
 */
public class IfDemo {

    public static void main(String[] args) {
        int mark = 30;
        
        // range 90-100 A+

        if (mark >= 90 && mark <=100) {
            System.out.println("A+");
        }
        if (mark >= 80 && mark <=89) {
            System.out.println("A");
        }
        if (mark >= 70 && mark <= 79) {
            System.out.println("B");

        }
        if (mark >= 60 && mark <= 69) {
            System.out.println("C");
        }
        if (mark >= 0 && mark <= 59) {
            System.out.println("F");
        }
    }
}
