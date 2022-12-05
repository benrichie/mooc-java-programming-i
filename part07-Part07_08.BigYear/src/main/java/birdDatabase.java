/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 61410
 */
import java.util.ArrayList;
public class birdDatabase {
    private ArrayList<Bird> birdList;
    
    public birdDatabase(){
        this.birdList = new ArrayList<>();
    }
      
// now for functionality, what do i need? print add bird, add observation, print all birds, print one bird.
   
    public void addBird(Bird bird){ //remember bird is short for birdName here
        birdList.add(bird);
    }
    
    public void addObservation(String name){
        for(Bird b: birdList){
            if(b.getName().toLowerCase().equals(name.toLowerCase())){
                b.addObservation();
            }
        }
    }
    public void printAll(){
        for(Bird b: birdList){
            System.out.println(b);
        }
    }
    
    public void printBird(String name){
        for(Bird b: birdList){
            if(b.getName().equals(name)){
                System.out.println(b);
            }
        }
    }
}
