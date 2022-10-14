
import java.util.Scanner;   //scanner in

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //scanner in
        
        // Write your program here
        System.out.println("What's your name? ");    //prompt sysout
        
        String name = scanner.nextLine();   //nextLine method to read strings 
        
        System.out.println("Hi " + name);
    }
}
