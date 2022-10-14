 
import java.util.Scanner;   //put scanner in
 
public class Message {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //put scanner in
 
        System.out.println("Write a message:"); // promt user 
        
        
        //read input 
        String message = scanner.nextLine();
        
        //print input
        System.out.println(message);
        
    }
}
 