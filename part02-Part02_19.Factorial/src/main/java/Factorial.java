
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner meow = new Scanner(System.in);
    
        System.out.println("Gie a number: ");
        int x = Integer.valueOf(meow.nextLine());
        int total = 1;
     
        for (int i = 1; i <= x; i++) {
            total *= i;
     
        }
        System.out.println("Factorial: "+ total);
    
    }
}
