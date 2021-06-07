/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner_lab12;

/**
 *
 * @author Miche
 */
public class Person 
{
    protected String name;
    protected String id;

    public Person(String n, String i) 
    {
        this.name = n;
        this.id = i;
    }
    public String toString()
    {
        return "Name:\t" + name + "\nID:\t" + id;
    }
        
}