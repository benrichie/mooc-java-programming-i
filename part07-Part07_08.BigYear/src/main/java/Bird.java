/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 61410
 */
public class Bird {
    
    private String name;
    private String latin;
    private int observation;
    
    // taking advantage of method overloading allows us to have multiple ways
    // to create a object
    
    public Bird(String name, String latin){
        this.name = name;
        this.latin = latin;
        this.observation = 0;
    }
    
        public Bird(String name, String latin, int observation){
            this.name = name;
            this.latin = latin;
            this.observation = observation;
        }
        
    // basic functionality that needs to be tied to the simple object & to String 
        
    public String getName(){
        return this.name;   
    }
    
    public void addObservation(){
        this.observation++;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.latin + "): " + this.observation + " observations ";
    }
}
