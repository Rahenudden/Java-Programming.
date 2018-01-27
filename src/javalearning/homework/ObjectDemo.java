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
public class ObjectDemo {
    int i= 5;
    double dob = 102.2;
    public static void main(String[] args) {
        ObjectDemo objectname = new ObjectDemo ();
        System.out.println ( objectname.i);
        
        
        ObjectDemo objectname1 = new ObjectDemo();
        System.out.println (objectname.dob);
        
        //if assaing variable value like dob = 20.2
        
        ObjectDemo objectname2 = new ObjectDemo ();
        // objectname.
        objectname2.dob = 23.5; 
        System.out.println (objectname2.dob);
        
    }
    
}
