/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.runner;

/**
 *
 * @author Miche
 */
import java.util.*;
public class Fraction {
   private double x;
   private double y;
   
   public Fraction()
   {
       x=0;
       y=0;
   }
   public Fraction(int a, int b)
   {
       x=a;
       y=b;
   }
   public void setX(int a)
   {
       x=a;
   }
   public double getX()
   {
       return x;
   }
   public void setY(int b)
   {
       y=b;
   }
   public double getY()
   {
       return y;
   }
   public void display()
   {
        System.out.println(x/y);
   }
   public boolean equal()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter any two numbers");
       double a=sc.nextDouble();
       double b=sc.nextDouble();
       double f1=x/y;
       double f2=a/b;
       if(f1==f2)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
}
