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
public class MethodOverloadingTest {

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println(methodOverloading.add(10.25, 54.50, 65.23)); // This way you have to call return variable.
        System.out.println(methodOverloading.add(10.25, 54.50)); // This way you have to call return variable.
        System.out.println(methodOverloading.add(10.25, 54.50, 65.23, 56.25)); // This way you have to call return variable.
    }
}
