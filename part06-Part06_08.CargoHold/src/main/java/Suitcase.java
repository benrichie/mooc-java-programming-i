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
public class Suitcase {
    
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.items = new ArrayList<Item>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        if(item.getWeight() + totalWeight() <= this.maxWeight){
            this.items.add(item);            
        }
    }
    
    public int totalWeight(){
        int sumOfWeight = 0;
        for(Item entry: items){
            sumOfWeight += entry.getWeight();
        }
        return sumOfWeight;
    }
    
    public void printItems(){
        for(Item x: items){
            System.out.println(x);
        }
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for(Item itm: items){
            if(heaviest.getWeight() < itm.getWeight() ){
                heaviest = itm;
            }
        }
        return heaviest;
    }
    
    public String listItems(){
        
        String listItems =  "";
        
        for(Item item : items){
            listItems += item.toString() + "\n";
        }
        
        return listItems;
    }
    
    @Override
    public String toString(){
        
        String printOutput = "";
        String cocina = this.totalWeight() + " kg)";
        
        if(this.items.size() == 0){
             printOutput = "no items" + " (" + cocina;
        } 
        else if(items.size() == 1){
             printOutput = this.items.size() + " item (" + cocina;
        } else {
             printOutput = this.items.size() + " items (" + cocina;
        }
        return printOutput;
    }
    

    
    
}
