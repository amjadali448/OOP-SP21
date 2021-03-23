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

public class LAB5Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Fraction f = new Fraction(4,6);
        f.display();
        boolean a = f.equal();
        System.out.println(a);
    }
}
