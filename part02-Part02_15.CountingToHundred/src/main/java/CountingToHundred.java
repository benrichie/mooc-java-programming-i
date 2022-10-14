
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = Integer.valueOf(scanner.nextLine());
        for (int x = input; x < 100+1; x++) {
            System.out.println(x);
        }
    }
}
