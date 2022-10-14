
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("How old are you? ");
        int x = Integer.valueOf(scan.nextLine());
        
        if ( x >= 18) {
            System.out.println("You are an adult");
        }else{
            System.out.println("You are not an adult");
        }
    }
}
