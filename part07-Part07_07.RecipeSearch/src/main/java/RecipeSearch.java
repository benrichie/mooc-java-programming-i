
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //this class will handle file IO aswell as create objects from the file 
  
        //create obj that holds recipes 
        RecipeManager recipeList = new RecipeManager();
        
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        
    try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
        
            ArrayList<String> fileLines = new ArrayList<>(); //create arrayList for lines of the file
            //arraylist for the indredients of a Recipe 
            
            while(fileScanner.hasNextLine()){ // loops until end of file
                
                String line = fileScanner.nextLine();
            
                if(line.trim().isEmpty() || !fileScanner.hasNextLine()){ ///when it comes to a blank line or the end of the file it 
                    // stops and and starts assign the lines/ArrayList to variables 
                
                    String name = fileLines.get(0); // every line is an array, add name and cooking, the rest as ingredient seperate list
                    int time = Integer.valueOf(fileLines.get(1));
                    
                    ArrayList<String> ingredientList = new ArrayList<>();// list for ingredients has to be made
                    
                    //add ingredients 
                    for(int i = 2; i < fileLines.size(); i++){
                        ingredientList.add(fileLines.get(i));
                    }
                     recipeList.addRecipe(new Recipe(name, time, ingredientList));     // creates an object and adds it to the Recipebook object which is an arrayList of obj
                     
                     fileLines.removeAll(fileLines);
                } else {
                    fileLines.add(line);
                }
            }
            
            
        } catch (Exception e){
            System.out.println("Error reading file " + e.getMessage());
        }
        
        UserInterface UI = new UserInterface(scanner, recipeList);
        
        UI.start();

    }

}
