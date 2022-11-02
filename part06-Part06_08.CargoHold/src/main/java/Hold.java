/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */
import java.util.ArrayList;
public class Hold {
    
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight() + suitcase.totalWeight() <= maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public int totalWeight(){
        int total = 0;
        for(Suitcase s: suitcases){
            total += s.totalWeight();
        }
        return total;
    }
    
    public String toString(){
        
        String output = "";
        String weight = "("+ this.totalWeight() + " kg)";
        
        if(suitcases.size() == 0){
            output = "no suitcases ";
        } else if(suitcases.size() == 1){
            output = this.suitcases.size() + "suitcase ";
        } else {
            output = this.suitcases.size() + "suitcases ";
        }
        return output + weight;
    }
    
    public void printItems(){
        for(Suitcase suitcase: suitcases){
            System.out.println(suitcase.listItems());
        }
    }
}
