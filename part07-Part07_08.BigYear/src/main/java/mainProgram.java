
import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        Scanner scanner = new Scanner(System.in);
    
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        double distance = Math.sqrt((x2 - x1)*(x2 - x1) + (y2-y1)*(y2-y1));
        System.out.println(distance);

    }

}
