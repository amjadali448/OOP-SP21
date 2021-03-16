/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner3;

/**
 *
 * @author Miche
 */
public class Runner3 
{
    public static void main(String[] args) 
    {
        HotDogStand h=new HotDogStand();
        //System.out.println("ID = "+h.getID()+" Got "+h.getSold()+" hot dogs");
        h.setID(170156);
        h.setSold(4);
        //HotDogStand h1=new HotDogStand(170156,4);
        System.out.println("ID = "+h.getID()+" Got "+h.getSold()+" hot dogs");
        HotDogStand h1=new HotDogStand();
        h1.setID(170157);
        h1.setSold(7);
        System.out.println("ID = "+h1.getID()+" Got "+h1.getSold()+" hot dogs");
        HotDogStand h2=new HotDogStand();
        h2.setID(170158);
        h2.setSold(9);
        System.out.println("ID = "+h2.getID()+" Got "+h2.getSold()+" hot dogs");
    }
}
