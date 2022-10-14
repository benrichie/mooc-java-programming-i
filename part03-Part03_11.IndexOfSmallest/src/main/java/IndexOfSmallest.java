
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<> ();
        

        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == 9999) {
                break;
            }

            list.add(userInput);
        }
        //smallest
        int smallest = list.get(0); // int smallest will copy value of first list

        for (int i = 0; i < list.size(); i++) { // increment through size of list
            int x = list.get(i); // x will equal value of list at each increment e.g list.get(0) -> x = first array value 
            if(smallest > x) { //if smallest value(value of list 0) is more then x(value of list at given increment) 
                smallest = x; // smallest copies x value so that smallest will always contain the smallest value 
                
            }
             /* the for loop above will take all list values and check against in the if() conditional so that smallest copies the value
                                                           once the for() condition is met it will print this statement.*/            
        }
        System.out.println("Smallest number: "+ smallest);
        //index
        int index; // we do index for readability, could just use value
        
        for(int i = 0; i < list.size(); i++) { // increments i++ to the size of the values in array
            int value = list.get(i); // take the array value coinciding with the i value  
            if(value == smallest){ //check that value against the smallest value if equal 
                index = i; // index copies i value at
                System.out.println("Found at index: "+ index); //
            }
            
        }


    }
}
