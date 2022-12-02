import java.nio.file.Paths;
import java.util.Scanner;
 
public class RecordsFromAFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        try(Scanner fileReader = new Scanner(Paths.get(input))){
            while(fileReader.hasNextLine()){
                String[] line = fileReader.nextLine().split(",");
                
                System.out.println(line[0]+", age: "+ line[1]+ " years");
            
                
                
                if (input.isEmpty()){
                    break;
                }
                
            }
            
            } catch (Exception e){
                    System.out.println("Error"+ e.getMessage());
                    
        }
    }
}
