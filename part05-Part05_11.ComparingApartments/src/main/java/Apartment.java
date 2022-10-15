
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        } 
        if(this.squares < compared.squares){
            return false;
        }
        
        return false;
    }
    
    public int priceDifference(Apartment compared){
        int difference =  (compared.princePerSquare * compared.squares) - (this.princePerSquare * this.squares);
        if(difference < 0){
            difference *= -1;
        }
        return difference;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if(this.princePerSquare > compared.princePerSquare){
            return true;
        }
        return false;
    }

}
