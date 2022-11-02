import java.util.ArrayList;

public class SimpleCollection { // create class, create variables 

    private String name;        
    private ArrayList<String> elements;

    public SimpleCollection(String name) {      // constructor for object 
        this.name = name;                       // name of object
        this.elements = new ArrayList<>();      // arraylist to hold string values
    }

    public void add(String element) {           
        this.elements.add(element);
    }
                                                // add & getter 
    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {

        String printString = "The collection " + this.name;

        if (this.elements.isEmpty()) {
            return printString + " is empty.";
        }

        String printValues = "";

        for (String element : elements) {    // check each array value 

            if (elements.size() <= 1) {      // if array size is <= 1 printValue = element
                printValues = element;
            } else {
                printValues = printValues + element + "\n";     // else we start the element string 
            }
        }

        String elementString = "";

        if (elements.size() > 1) {      // if more than was "elements" else "element"
            elementString = "elements:\n";
        } else {
            elementString = "element:\n";
        }
        return printString + " has " + elements.size() + " " + elementString + printValues;
    }

}