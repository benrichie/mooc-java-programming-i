/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */
public class Books {
    
    private String Title;
    private int Pages;
    private int publicationYear;
    
    public Books(String Title, int Pages, int publicationYear){
        this.Title = Title;
        this.Pages = Pages;
        this.publicationYear = publicationYear;
    }
    
    public String getTitle(){
        return Title;
    }
    
    public int getPages(){
        return Pages;
    }
    
    public int getPublication(){
        return publicationYear;
    }
    
    @Override
    public String toString(){
        return this.Title +", "+ this.Pages + " pages, "+ this.publicationYear;
    }

}
