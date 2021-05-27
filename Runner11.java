/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner11;

/**
 *
 * @author Miche
 */
public class Runner11 {
    public static void main(String[] args) 
    {
        Rectangle r = new Rectangle(5,10);
        Circle c = new Circle(7);
        Triangle t = new Triangle(4,3);
        Shape[] shape= {r,c,t};
        double [] array1 = calculateAreas(shape);
        for (int i = 0; i<shape.length;i++)
        {
            System.out.println("Area = "+array1[i]);
        }
    }
    public static double[] calculateAreas(Shape[] shape) 
    {
        double[] list= new double[shape.length];
        for(int i=0;i<shape.length;i++) 
        {
            list[i]=shape[i].area();
        }
        return list;
    }
}