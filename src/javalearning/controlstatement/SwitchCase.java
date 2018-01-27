/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.controlstatement;

/**
 *
 * @author rahen
 */
public class SwitchCase {
    public static void main(String [] args){
       /*
switch (expression){
            case value1:
                statement;
                break ;
            case value2:
                statement ;
                break;
            default:
                statement;
        }
*/
       int month = 1;
       String monthString="";
       switch (month){
           case 1:
               monthString="January";
               break;
           case 2:
               monthString ="february";
               break;
           case 3:
               monthString="march";
               break;
           default:
               monthString="none";
                       
               
              
       }System.out.println(monthString);
    }
    
}
