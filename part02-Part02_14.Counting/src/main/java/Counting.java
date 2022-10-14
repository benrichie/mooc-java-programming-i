
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        count = Integer.valueOf(scanner.nextLine());
        
        for (int number = 0; number < count+1; number++) {
            System.out.println(number);
        }
        
    }
}
