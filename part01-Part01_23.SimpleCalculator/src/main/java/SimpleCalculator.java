
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int y = Integer.valueOf(scanner.nextLine());
        
        System.out.println(x+" + "+y +" = "+ (x+y));
        System.out.println(x+" - "+y +" = "+ (x-y));
        System.out.println(x+" * "+y +" = "+ (x*y));
        System.out.println(x+" / "+y +" = "+ (1.0 * x/y));
    }
}
