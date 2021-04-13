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
public class PizzaOrder{
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;

    PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3) {
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
        this.pizza3 = pizza3;
    }

    public void setPizza1(Pizza pizza1) {
        this.pizza1 = pizza1;
    }

    public void setPizza2(Pizza pizza2) {
        this.pizza2 = pizza2;
    }

    public void setPizza3(Pizza pizza3) {
        this.pizza3 = pizza3;
    }

    public Pizza getPizza1() {
        return pizza1;
    }

    public Pizza getPizza2() {
        return pizza2;
    }

    public Pizza getPizza3() {
        return pizza3;
    }
    public double calcTotal()
    {
        return(pizza1.calcCost(pizza1.getPizza_size(),pizza1.getNum_cheese(),pizza1.getNum_pepperoni(),pizza1.getNum_ham()));
    } 
}
