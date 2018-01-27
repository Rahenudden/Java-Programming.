package MethodDemo;

public class MethodDemo {
// Now I will not  print 4th main method of Maths class. I will bring the 
    // the value from Maths class.

    public static void main(String[] args) {
        // Now create object like as  ClassName objectName = new ClassName(); 
        //ClassName is Maths, ObjectName is math 
        //(Here I can choice the objectName like math or Rahen)

        Maths math = new Maths();
        // Now call a method like as objectNmae.methodName(); Here 
        // math is objectName and addTwonumber is methodName from class Maths.
        int sum = math.addTwoNumber();
        System.out.println(sum * 2);
        
        System.out.println( math.add(10, 10)); // this way we can declare method when return value is called.
    }

}
