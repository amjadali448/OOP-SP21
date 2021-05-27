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
public class Circle implements Shape 
{
    private double radius;
    public Circle() 
    {
        this.radius = 0;
    }
    public Circle(double radius) 
    {
        this.radius = radius;
    }
    @Override
    public double area() 
    {
        return this.radius*this.radius*pi;
    }
}
