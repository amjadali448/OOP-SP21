/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruunerlab6;

/**
 *
 * @author Miche
 */
import java.util.Scanner;
import java.lang.Math;
public class RuunerLab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Calculator C = new Calculator(10,3);
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1 for sum");
        System.out.println("Enter 2 for multiply");
        System.out.println("Enter 3 for divide");
        System.out.println("Enter 4 for modulus");
        System.out.println("Enter 5 for sin");
        System.out.println("Enter 6 for cos");
        System.out.println("Enter 7 for tan");
        int x = myObj.nextInt();
        
        if(x==1)
        {
            Calculator.sum();
        }
        else if(x==2)
        {
            Calculator.multiply();
        }
        else if(x==3)
        {
            Calculator.divide();
        }
        else if(x==4)
        {
            Calculator.modulus();
        }
        else if(x==5)
        {
            Calculator.sine();
        }
        else if(x==6)
        {
            Calculator.cosine();
        }
        else
        {
            Calculator.tangent();
        }
    }
}