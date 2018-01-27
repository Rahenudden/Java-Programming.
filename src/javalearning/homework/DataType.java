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
public class DataType {
    public static void main (String []agrs ){
         byte b = -128;
        System.out.println("Byte value: " + b);
        short s = -32768;
        System.out.println("short value:"+s);
        long l = 1500;
        System.out.println("long value:"+l);
        float f = 500.600f;
        System.out.println("float value:"+f);
        double d = 2000d;
        System.out.println("double value:"+d);
        boolean bl= true;
        System.out.println("boolean value:"+bl);
        char ch = 'A';
        System.out.println("char value:"+ch);
        char ch1= '5' ;
        //Here value taking from 1 to 9. Not more than 9. why ?  //
        System.out.println("char value:" + ch1);
        char ch2= '0' ;
        char ch3 = '1';
        System.out.println( "char value:" + ( ch3- ch2));
        char ch4= 'A' ;
        char ch5= 'B';
        System.out.println("char value:" + (ch4 - ch5));
    }
    
}
