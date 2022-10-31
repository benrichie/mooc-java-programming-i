
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest(){
        if(elements.isEmpty()){
            return null;
        }
        
        //taking the value of the first array-value to be compared
        String returnElement = this.elements.get(0);
        
        //go through list
        for(String elm: this.elements){
            
            if(returnElement.length() < elm.length()){
                returnElement = elm;
            }
        }
        return returnElement;
    }

}
