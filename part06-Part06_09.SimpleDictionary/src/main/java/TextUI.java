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
    
   System.out.println("Command: ");
    
   while(true){
       if(scanner.equals("end")){
           System.out.println("Bye bye!");
           break;
       } else {
           System.out.println("Unknown command");
       }
   
       
   }
}

}
