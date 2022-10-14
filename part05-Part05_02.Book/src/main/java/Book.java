/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */
//class to instatiate variables to describe method 
public class Book {
    private String author;
    private String name;
    private int pages;
    
    // constructor used to create object from given data (setter?)
    public Book(String author, String name, int pages){
        this.author = author;
        this.name = name;
        this.pages = pages;
    }
    
    //getters
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public String toString(){
        return this.author+ ", "+ this.name+ ", "+ this.pages+" pages";
    }
}
