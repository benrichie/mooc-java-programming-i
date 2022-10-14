
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String scan = scanner.nextLine();
            System.out.println("Shall we carry on?");
            if (scan.equals("no")) {
                break;
            }
            
        }
    }
}
