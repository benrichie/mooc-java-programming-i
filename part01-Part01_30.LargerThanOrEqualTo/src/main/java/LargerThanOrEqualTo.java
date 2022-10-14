
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int x = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number: ");
        int y = Integer.valueOf(scan.nextLine());
        
        if (x > y ) {
            System.out.println("Greater number is:" + x);
        } else if  ( x < y) {
            System.out.println("Greater number is:" + y);
        }else{
            System.out.println("The numbers are equal!");
        }
        
    }
}
