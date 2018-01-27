
package MethodDemo;
public class Maths {
    // we will not write main method here because we will not print here we 
    // will print it in another class. 

    public void NamePrint() { // 1st main method
        System.out.println("Rahen");
    }

    public void NameR() { // 2nd main method 
        System.out.println("Bangladesh");
    }

    public void addTwonumbers() { //3rd main method
        int a = 5;
        int b = 6;
        int result = a + b;
        System.out.println(result);

    }// for returning value not print 

    public int addTwoNumber() { // 4th main method
        int a = 5;
        int b = 6;
        int sum = a + b;
        
        return sum;
       
    }
     public int add (int a, int b ){ // here int a is one parameter and int b is another parameter.
        int restult = a+b; //here result is variable 
        return a+b ; 
     }
}// All this four main mehtod will print in the MethodDemo class.
