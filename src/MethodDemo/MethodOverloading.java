/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodDemo;

/**
 *
 * @author rahen
 */
public class MethodOverloading {
    public double add(double number1,double number2){
        return number1+number2;
    }
    public double add(double number1,double number2,double number3){
        return number1+number2+number3;
    }
    public double add(double number1, double number2,double number3,double number4){
        return number1+number2+number3+number4;
    }
}
