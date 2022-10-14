
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0; 
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            if (index < list.size()){
                index++;
            }

            list.add(input);
        }
        System.out.println(list.get(index));
    }
}
//Test solution just does ->  System.out.println(list.get(list.size() - 1));
// use this for next one 