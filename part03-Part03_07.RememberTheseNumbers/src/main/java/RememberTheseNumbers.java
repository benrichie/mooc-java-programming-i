
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }
      
            numbers.add(luku);
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

    }
}
/* I can use count to copy the array but if i do i++ or i+= luku that doesnt 
seem like the solution I want. Maybe ill try i++ since that makes the more sense*/

/*After a bit of cheating I see that i++ works fine because you are using the .get to pull 
from the array so .get(i)when i=0 would pull the first array; furthermore since the numbers are 
stored in a array it can be pulled anytime, if i did a count loop inside the while loop i think i 
cant avoid printing after each count so doing it outside is the only way.*/