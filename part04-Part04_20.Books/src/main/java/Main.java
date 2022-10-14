import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> list = new ArrayList<>();
        // implement here the program that allows the user to enter 
        // book information and to examine them
        while(true){
            String title = scanner.nextLine();
            
            if(title.isEmpty()){
                break;
            } 
            
            int pages = Integer.valueOf(scanner.nextLine());
            int year = Integer.valueOf(scanner.nextLine());
            
            list.add(new Books(title,pages,year));
        }
        
        System.out.println("What information will be printed?");
        String information = scanner.nextLine();
        
        for(Books books: list){
            if(information.equals("everything")){
                System.out.println(books);
            } else if (information.equals("name")){
                System.out.println(books.getTitle());
            }
        }

    }
}
