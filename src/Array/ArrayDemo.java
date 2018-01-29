/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author rahen
 */
public class ArrayDemo {
    public static void main(String[] args) {
        String[] name=new String[5]; // This is Array 
        name[0]="Rahoman";
        name[1]="Harun";
        name[2]="Don";
        name[3]="Reza";
        name[4]="Jon";
        
        
        System.out.println(name[3]);
        
        for(int i=0;i<5;i++){ // This is loop.
            System.out.println(name[i]);
        }
    }
}
