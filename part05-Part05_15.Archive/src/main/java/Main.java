
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ArrayList<Archive> archive = new ArrayList<>();
       
       while(true){
           
           System.out.println("Identifier? (empty will stop)");
           String iden = scanner.nextLine();
           
           if(iden.isEmpty()){
               break;
           }
           
           System.out.println("Name? (empty will stop");
           String name = scanner.nextLine();
           
           if(name.isEmpty()){
               break;
           }
           
           Archive a = new Archive(iden, name);
           if(archive.contains(a)){
               continue;
           }else{
               archive.add(a);
           }
           
           
           System.out.println("==Items==");
           //forloop to print each
           for(Archive i: archive){
               System.out.println(i.getIdentifier()+ ": "+ i.getName());
           }
       }
       
    }
}
