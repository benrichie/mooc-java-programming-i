/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */
import java.util.Scanner;
public class TextUI {
   
    private SimpleDictionary simpleDictionary;
    private Scanner scanner;

public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
    
    this.scanner = scanner;
    this.simpleDictionary = simpleDictionary;
}  

public void start(){
    
  
    
   while(true){
       System.out.println("Command: ");
       String scn = scanner.nextLine();
       if(scn.equals("end")){
           System.out.println("Bye bye!");
           break;
       }
       
       if(scn.equals("add")){
           
           System.out.println("Word: ");
           String wrd = scanner.nextLine();
           
           System.out.println("Translation: ");
           String trns = scanner.nextLine();
           
           this.simpleDictionary.add(wrd, trns);
       } else {
           System.out.println("Unknown command");
       }
   }
}

}
