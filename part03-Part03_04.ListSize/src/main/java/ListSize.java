import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                list.size();
                counter++;
            }
            
            list.add(input);
        }
        System.out.println(counter);

    }
}
// I could have just put sout(list.size()); and that would give me the same result
// instead of using counter, since arrays list.size is a "built in" counter