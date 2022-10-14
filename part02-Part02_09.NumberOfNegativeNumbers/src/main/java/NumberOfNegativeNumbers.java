
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int y = Integer.valueOf(scanner.nextLine());
            
            if (y==0){
                break;                
            }
            
            if (y < 0) {
                x = x + 1;
            }
            
        }
        System.out.println("Number of negative numbers: "+ x);
    }
}
