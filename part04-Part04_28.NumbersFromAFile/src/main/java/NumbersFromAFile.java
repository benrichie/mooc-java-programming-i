
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(); 
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int count = 0;
        
        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                list.add(reader.nextLine());
                }
            }   catch(Exception e){
                    System.out.println("Error: "+ e.getMessage());  
            }
        // check all values then check values between range then count them
        
        for(String item : list){ 
            int number = Integer.valueOf(item);
            if (number >= lowerBound && number <= upperBound){
                count++;
            } else {
                continue;
            }
        }
        System.out.println("Numbers: "+ count);
    }
}


