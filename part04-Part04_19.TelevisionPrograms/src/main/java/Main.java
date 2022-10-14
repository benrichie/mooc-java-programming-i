import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.println("");
            
            if(name.isEmpty()){
                break;
            }
            
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            System.out.println("");
            
            programs.add(new TelevisionProgram(name,duration));
        }
        
        // for each with condition.
        System.out.println("Program's maximum duration?");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        // object index: array
        for(TelevisionProgram tv: programs){
            if(tv.getDuration() <= maxDuration){
                System.out.println(tv); // will run the to string for objects at each array
            }
        }
        
           
            
    }
}
