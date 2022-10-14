
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        // Write some code here
        int sum = 0; // variable for sum
        for(int i = 0; i < array.length; i++) { // increment untill array.length
            int value = array[i]; // value of array at each increment 
            sum += value; // sum = sum + value
        }
        return sum;
    }
}
 