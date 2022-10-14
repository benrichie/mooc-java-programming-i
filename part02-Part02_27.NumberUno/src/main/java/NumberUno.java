
import java.util.Scanner;

public class NumberUno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.valueOf(scanner.nextLine());
        x = numberUno();
        System.out.println(x);
    }
    public static int numberUno(){
        return 1;
    }

}
