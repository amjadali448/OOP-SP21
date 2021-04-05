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
public class Calculator 
{
    private static double a;
    private static double b;
    
    Calculator()
    {
        a=1;
        b=1;
    }
    Calculator(double x,double y)
    {
        a=x;
        b=y;
    }
    public static void setA(double x)
    {
        a=x;
    }
    public static double getA()
    {
        return a;
    }
    public static void setB(double y)
    {
        b=y;
    }
    public static double getB()
    {
        return b;
    }
    public static void sum()
    {
        double sum;
        sum=a+b;
        System.out.println("SUM = "+sum);
    }
    public static void multiply()
    {
        double multiply;
        multiply=a*b;
        System.out.println("MULTIPLY = "+multiply);
    }
    public static void divide()
    {
        double divide;
        divide=a/b;
        System.out.println("DIVIDE = "+divide);
    }
    public static void modulus()
    {
        double modulus;
        modulus=a%b;
        System.out.println("MODULUS = "+modulus);
    }
    public static void sine()
    {
        double sine;
        double radians = Math.toRadians(a);
        sine=Math.sin(radians);
        System.out.println("SINE = "+sine);
    }
    public static void cosine()
    {
        double cos;
        double radians = Math.toRadians(b);
        cos=Math.cos(radians);
        System.out.println("COSINE = "+cos);
    }
    public static void tangent()
    {
        double tan;
        double radians = Math.toRadians(a);
        tan=Math.tan(radians);
        System.out.println("TANGENT = "+tan);
    }   
}
