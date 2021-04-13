/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnerlab7;

/**
 *
 * @author Miche
 */
public class RunnerLAB7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza piz1 = new Pizza();
        Pizza piz2 = new Pizza();
        Pizza piz3 = new Pizza();
        Pizza piz4 = new Pizza("Medium",2,2,2);
        Pizza piz5 = new Pizza("small",2,1,3);
        Pizza piz6 = new Pizza("LARGE",1,1,1);
        Pizza piz7 = new Pizza("small",2,2,2);
        Pizza piz8 = new Pizza("LARGE",2,1,3);
        Pizza piz9 = new Pizza("Medium",1,1,1);
        PizzaOrder p1 = new PizzaOrder(piz4,piz5,piz6);
        PizzaOrder p2 = new PizzaOrder(piz7,piz8,piz9);
        System.out.println("TOTAL COST OF PIZZA1 = $"+p1.calcTotal());
        System.out.println("TOTAL COST OF PIZZA2 = $"+p2.calcTotal());
        piz1.setPizza_size("Medium");
        piz1.setNum_cheese(2);
        piz1.setNum_pepperoni(2);
        piz1.setNum_ham(2);
        System.out.println(piz1.getDescription());
        piz2.setPizza_size("Small");
        piz2.setNum_cheese(2);
        piz2.setNum_pepperoni(1);
        piz2.setNum_ham(3);
        System.out.println();
        System.out.println();
        System.out.println(piz2.getDescription());
    }
    
}
