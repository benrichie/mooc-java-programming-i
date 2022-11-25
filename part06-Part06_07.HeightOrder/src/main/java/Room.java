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
public class Room {
    
    private ArrayList<Person> persons;
    
    //parameterless constructor 
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person persons){
        this.persons.add(persons);
    }
    
    public boolean isEmpty(){
        return this.persons.isEmpty();
    }
    
    // returns a list of persons in the rooom
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
}
