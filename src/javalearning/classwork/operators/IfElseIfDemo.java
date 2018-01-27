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
public class IfElseIfDemo {

    public static void main(String[] args) {
        int testscore = -10;
        char grade;
        
        if (testscore >= 90 && testscore <= 100) {
            grade = 'A';
        } else if (testscore >= 80 && testscore <= 90) {
            grade = 'B';
        } else if (testscore >= 70 && testscore <= 80) {
            grade = 'C';
        } else if (testscore >= 60 && testscore <= 70) {
            grade = 'D';
        } else if (testscore < 60 && testscore >= 0) {
            grade = 'F';
        } else {
            grade = 'N';

        }
        if (grade == 'N') {
            System.out.println('p' + " = Invalid number!!");

        } else {
            System.out.println(grade);
        }

    }

}
