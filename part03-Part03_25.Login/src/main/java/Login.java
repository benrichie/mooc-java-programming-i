
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName1 = "alex";
        String userName2 = "emma";
        String passWord1 = "sunshine";
        String passWord2 = "haskell"; 
        
        System.out.println("Enter username: ");
        String input = scanner.nextLine();
        
        System.out.println("");
        
        System.out.println("Enter password: ");
        String input2 = scanner.nextLine();
        
        if (input.equals(userName1)&& input2.equals(passWord1)) {
            System.out.println("You have successfully logged in: ");
        } 
        else if (input.equals(userName2)&& input2.equals(passWord2)) {
            System.out.println("You have successfully logged in: ");
        } else {
            System.out.println("Incorrect username or password!");
        }
        
    }
}
