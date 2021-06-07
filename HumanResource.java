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
import java.util.ArrayList;
public class HumanResource
{
    private ArrayList <Association> resources;

    public HumanResource(){
        resources = new ArrayList<>();
    }
    
    public void add(Association r){
        resources.add(r);
    }
    /*public void add(Association  pp)
    {
        extend();
        
        p[count] = pp;
        count++;            
    }
    private void extend()
    {
        Association[] newPerson = new Association[count+1];
        
        if(count > 0)
        {
            for(int i=0; i<newPerson.length; i++)
            {
                newPerson[i] = p[i];
            }
            
            p = newPerson;
        }
    }
    public void display()
    {
        for(int i=0; i<p.length; i++)
        {
            System.out.println(p[i] + "\n");
        }
    }*/
    public boolean delete(String ID){
        
        for(int i = 0; i<resources.size(); i++){
            if(((Person)resources.get(i)).id == ID){
                resources.remove(i);
                return true;
            }
        }
        return false;
    }   
    public void display()
    {
        for(int i = 0; i <resources.size();i++)
        {
            System.out.println();
            System.out.println(i+1+":-"+resources.get(i).toString());
            System.out.println();
        }
    }
}