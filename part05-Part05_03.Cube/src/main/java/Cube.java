/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */
//instatiate variable for object
public class Cube {
    private int edgeLength;
    
    // setter method
    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
    }
    
    // getter method
    public int volume(){
        return edgeLength * edgeLength * edgeLength;
    }
    
    public String toString(){
        return "The length of the edge is "+ this.edgeLength + " and the volume "+ volume();
    }
    
    
}
