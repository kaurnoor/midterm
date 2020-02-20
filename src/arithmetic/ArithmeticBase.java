/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and add object oriented principles satisfy as comment in the code
 * @author sivagamasrinivasan
 * date 02/19
 */
public class ArithmeticBase 
{
 public double x,y;
 // we can declare these variables as private and can use getter and setter methods to acquire encapsulation
    double calculate(double x, double y) // this method should be public
        {
        //Scanner sc =new Scanner(System.in);
        System.out.println("enter String");
        //String s= sc.next();
        public enum Operation {PLUS, MINUS, TIMES, DIVIDE};
        private Operation s;
        switch (s.value) 
        {
            case "PLUS":
                return x + y;
            case "MINUS":
                return x - y;
            case "TIMES":
                return x * y;
            case "DIVIDE":
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
