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
public class Rectangle implements Shape{
    private double length;
    private double width;
    public Rectangle() 
    {
        this.length = 0;
        this.width = 0;
    }
    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() 
    {
        return this.length*this.width;
    }
}
