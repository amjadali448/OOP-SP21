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
public class Runner_Lab12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        HumanResource h1 = new HumanResource();
        
        h1.add( new Teacher("LAIBA", "123") );
        h1.add( new Teacher("MEHMOOD", "321") );
        h1.add( new Teacher("CHOTA DON", "456") );
        h1.add( new Student("ALIZAY", "654") );
        h1.add( new Student("TARIQA", "789") );
        h1.add( new Student("HASEEBA", "987") );
        
        System.out.println(h1.delete("789"));
        h1.display();
        
        Association obj1 = new Student("student", "741");
        obj1.associate();
        Association obj2 = new Student("teacher", "147");
        obj2.associate();
    }
    
}
