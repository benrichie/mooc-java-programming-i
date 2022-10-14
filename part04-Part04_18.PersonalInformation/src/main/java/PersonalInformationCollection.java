
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>(); // ArrayList<Class/Object> "name" = ect.
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            System.out.println("");
                        
            if(firstName.isEmpty()){
                break;
            }
            
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            
            
            System.out.println("Identification number: ");
            String identificationNumber = scanner.nextLine();
            System.out.println("");
            
            // to add to a "object-array" look at creation of the array for the "values"
            // ArrayList<**PersonalInformation**> **infoCollection** = **new** ArrayList<>();
            infoCollection.add(new PersonalInformation(firstName, lastName, identificationNumber));
        }
        //for each (Item item: items)  Item object, item index, items input(array)
        for(PersonalInformation information: infoCollection){
            System.out.println(information.getFirstName()+ " "+ information.getLastName());
        }
        // information = index/i (information.getLastName()) is like list.get(i)
        // get.(F)irstName , as we are using the getter
    }
}
