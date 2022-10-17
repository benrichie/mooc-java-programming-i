/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */
public class Archive {
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public String getIdentifier(){
        return identifier;
    }
    
    @Override
    public boolean equals(Object comparison){
        if (this == comparison){
            return true;
        }
        
        if(!(comparison instanceof Archive)){
            return false;
        }
        
        Archive comparedItem = (Archive) comparison;
        
        return this.identifier.equals(comparedItem.identifier);
    }
}
