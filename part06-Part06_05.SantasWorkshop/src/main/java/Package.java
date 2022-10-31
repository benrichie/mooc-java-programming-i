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
public class Package {
    
    private ArrayList<Gift> gifts;
    
    public Package(){                   // parameterless constructor 
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        this.gifts.add(gift);
    }
    
    public int totalWeight(){
        if(this.gifts.isEmpty()){
            return -1;
        }
        
        int total = 0;
        
        for(Gift gift: gifts){
            total += gift.getWeight();
        }
        return total;
    }
}