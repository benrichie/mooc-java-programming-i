
import java.util.Scanner;

public class SumOfASequence {

    
    public static void main(String[] args) {
Scanner x = new Scanner(System.in);
        System.out.println("customer");
System.out.print("Customer number: ");
int y = Integer.valueOf(x.nextLine());

if (y % 2000 == 0) {
    System.out.println("Gets a large gift card!");
} else if (y > 1000 && y % 25 == 0) {
    System.out.println("Gets a gift card.");
} else {
    System.out.println("Gets nothing.");
}
    }
}

