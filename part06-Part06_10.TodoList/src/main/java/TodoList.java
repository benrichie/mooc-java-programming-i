/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */


// this is the array object where we have array to hold values & methods to run functions 
import java.util.ArrayList;
public class TodoList {
    
    private ArrayList<String> Todo;
            
    public TodoList(){
        this.Todo = new ArrayList<String>();
    }
    
    public void add(String task){
        this.Todo.add(task);
    }
    
    public void print(){
        for(String todo: Todo){
            System.out.println((this.Todo.indexOf(todo)+ 1)+ ": " + todo );
        }
    }
    
    public void remove(int number){
        this.Todo.remove(number - 1);
    }
    
}
