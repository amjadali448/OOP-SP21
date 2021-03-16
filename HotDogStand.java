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
public class HotDogStand {
    private int ID,sold_items;
    HotDogStand()
    {
        ID=170157;
        sold_items=3;
    }
    HotDogStand(int id,int s)
    {
        ID=id;
        sold_items=s;
    }
    public void setID(int id)
    {
        ID=id;
    }
    public int getID()
    {
        return (ID);
    }
    public void setSold(int s)
    {
        sold_items=s;
    }
    public int getSold()
    {
        justSold();
        return (sold_items);
    }
    public void justSold()
    {
        sold_items+=1;
        //return (sold_items);
    }
}
