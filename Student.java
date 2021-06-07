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

public class Student extends Person implements Association
{
    private int rollNum;
    private int semester;
    public Student() 
    {
        super("abc","0");
    }
    public Student(String name, String id) 
    {
        super(name, id);
        associate();
    }
    public void associate() 
    {
        this.rollNum = 042;
        this.semester = 3;
    }
    public String toString()
    {
        return "   STUDENT\n" + super.toString() + "\nRoll Number:\t" + rollNum + "\nSemester:\t" + semester;
    }
}
