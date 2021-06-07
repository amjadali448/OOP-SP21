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

import java.util.Scanner;

public class Teacher  extends Person implements Association
{
    private String designation;
    private String department;
    public Teacher() 
    {
        super("1","0");
    }
    public Teacher(String name, String id) 
    {
        super(name,id);
        associate();
    }
    public void associate() 
    {
        this.designation = "INSTRUCTOR";
        this.department = "COMPUTER SCIENCE";
        
    }
    public String toString()
    {
        return "   TEACHER\n" + super.toString() +  "\nDesignation:\t" + designation + "\nDepartment:\t" + department;
    }
}