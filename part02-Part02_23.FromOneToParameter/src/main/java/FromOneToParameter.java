

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    public static void printUntilNumber(int numberOfTimes){
        int x = 1;
        while (x < numberOfTimes+1){
            System.out.println(x);
            x++;
        }
    }

}
