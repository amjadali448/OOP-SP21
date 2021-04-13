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
public class Pizza {
    private String pizza_size;
    private int num_cheese;
    private int num_pepperoni;
    private int num_ham;
    
    Pizza()
    {
        pizza_size="";
        num_cheese=1;
        num_pepperoni=1;
        num_ham=1;
    }
    Pizza(String p_size,int n_cheese,int n_pepperoni,int n_ham)
    {
        pizza_size=p_size;
        num_cheese=n_cheese;
        num_pepperoni=n_pepperoni;
        num_ham=n_ham;
    }
    public void setPizza_size(String p_size) 
    {
        pizza_size = p_size;
    }
    public String getPizza_size() 
    {
        return pizza_size;
    }
    public void setNum_cheese(int n_cheese) 
    {
        num_cheese = n_cheese;
    }
    public int getNum_cheese() 
    {
        return num_cheese;
    }
    public void setNum_pepperoni(int n_pepperoni) 
    {
        num_pepperoni = n_pepperoni;
    }
    public int getNum_pepperoni() 
    {
        return num_pepperoni;
    }
    public void setNum_ham(int n_ham)
    {
        num_ham = n_ham;
    }
    public int getNum_ham() 
    {
        return num_ham;
    }
    public double calcCost(String p_size,int n_cheese,int n_pepperoni,int n_ham)
    {
        double total=0;
        if (p_size=="Small" || p_size=="small" || p_size=="SMALL")
        {
            total = 10 + (2 * (n_cheese + n_pepperoni + n_ham));
            return total;
        }
        else if(p_size=="Medium" || p_size=="medium" || p_size=="MEDIUMS")
        {
            total = 12 + (2 * (n_cheese +n_pepperoni +n_ham));
            return total;
        }
        else if(p_size=="Large" || p_size=="large" || p_size=="LARGE")
        {
            total = 14 + (2 * (n_cheese +n_pepperoni +n_ham));
            return total;
        }
        return 0;
    }
    public String getDescription()
    {
        double total=calcCost(getPizza_size(),getNum_cheese(),getNum_pepperoni(),getNum_ham());
        return "A "+getPizza_size()+" PIZZA WITH "+(getNum_cheese()+" cheese,"+getNum_pepperoni()+" one pepperoni and "+getNum_ham()+" ham should cost a total of $"+total);
    }
}
