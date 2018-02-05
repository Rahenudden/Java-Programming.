/* User Input Array  */
package javalearning.homework.Array;

import java .util.Scanner; //This scanner class.
public class UserInput {
    
    public static void main(String[]args)
    {
       Scanner scan = new Scanner (System.in);
       System.out.println("Enter my friens number ");
       int number;
       number = scan.nextInt(); // This take user input. Formula:- variable = object of Scanner.next+datatype+();
       
      
       String [] names = new String [number]; //This is Array .
       
      for (int counter =0; counter  < number; counter ++)
      {
          System.out.println("Enter name of my friend " + (counter+1));
          names[counter] = scan.next(); /*This will give input access so Formula:- Object of array [object of for loop]
                                            = object
                                            scanner.nest();*/                                   
      }
        scan.close(); // Here scan is Scanner's object.
          System.out.println("Your friends are");
        for (int counter =0; counter  < number; counter ++)
      {
          System.out.println(names[counter]); // Object of Array (variable of Data type);
          
        
      }
    }
     
}
