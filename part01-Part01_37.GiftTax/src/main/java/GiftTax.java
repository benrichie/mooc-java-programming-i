
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int x = Integer.valueOf(scan.nextLine());
        
        if (!(x < 1000000)){
            System.out.println((142100 + (x - 1000000) * 0.17));
          
        } else if (!(x > 1000000 || x < 200000)) {
            System.out.println((22100 + (x - 200000) * 0.15)); 
          
        } else if (!(x < 55000 || x > 200000)){
            System.out.println((4700 + (x - 55000) * 0.12));
          
        } else if (!(x < 25000 || x > 55000)) {
            System.out.println((1700 + (x - 25000) * 0.10));
        
        } else if (!(x < 5000 || x > 25000)) {
            System.out.println((100 + (x - 5000) * 0.08));  
            
        }else {
            System.out.println("No tax!");
        }
          
    }
}
