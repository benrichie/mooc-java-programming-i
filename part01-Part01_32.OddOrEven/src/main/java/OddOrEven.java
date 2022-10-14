
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Give a number: ");
        int x = Integer.valueOf(scan.nextLine());
        
        if (x % 2 == 0){
            System.out.println("Number " + x + " is even.");
        } else {
            System.out.println("Number " + x + " is odd.");
        }
        
    }
}
