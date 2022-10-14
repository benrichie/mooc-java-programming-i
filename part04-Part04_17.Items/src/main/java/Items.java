
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Name: ");
            System.out.println("");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            } 
            items.add(new Item(name));
        }
        
        for(Item item: items) // Item object, item index, items input(array)
            System.out.println(item);
    }
}
