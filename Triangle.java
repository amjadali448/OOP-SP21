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
public class Triangle implements Shape
{
    private double base;
    private double height;
    public Triangle() 
    {
        this.base = 0;
        this.height = 0;
    }
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double area()
    {
        return 0.5*this.base*this.height;
    }
}
