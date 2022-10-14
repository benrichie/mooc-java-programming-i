

public class Sandbox {

    public static void main(String[] args) {
        //1
        int firstNumber = 2 + 4; 
        double secondNumber = (5) + (-1.5); 
        double thirdNumber = (10.4) + (-919);
        System.out.println(firstNumber+ " "+ secondNumber+ " "+ thirdNumber);
        
        //2
        int q2 = 10 - 5; // "5 from 10"
        double q2a = (-1111) - (204.3); 
        int q2b = 100 - 40;
        System.out.println(q2+ " "+ q2a+ " "+ q2b);
        System.out.println("");
        //3
        double q3 = 138.0 / 0.0; 
        double q3a = 30.0 / 2.0; 
        double q3b = 15.0 / 2.0;
        double q3c = (-120.0) / (-2.0);
        double q3d = 10000.57 / 20.0;
        System.out.println(q3+ " "+ q3a+ " "+ q3b+ " "+ q3c+ " "+ q3d);
        System.out.println("");
        //4
        int q4 = 100 * 10;
        int q4a = 20 * 10;
        double q4b = 45.7 * 30.2;
        System.out.println(q4+ " "+ q4a+ " "+ q4b);
        System.out.println("");
        //5
        System.out.print("I already know the following\n"+ "Java, C++, C\n");
        System.out.println("");
        String m = "I am enrolled in the following courses";
        String n = "Introduction to OOP, Calculus and Discrete";
        System.out.println(m);
        System.out.println(n);
        System.out.println("");
        //6
        String concat = m.concat(n);
        String b = m + n;
        System.out.println(concat);
        System.out.println(b);
        //7
        String q7 = "Hello World!";
        System.out.println(q7.contains("a")||q7.contains("e")||q7.contains("i")||q7.contains("o")||q7.contains("u"));
        //8
        String q8 = "Hello I am student. I am currently learning Java";
        String java = "Java";
        String hello = "Hello";
        System.out.println("string ends with Hello ? "+q8.endsWith(hello)+", "+ "with Java ? "+ q8.endsWith(java));
        System.out.println("string starts with Hello ? "+q8.startsWith(hello)+", "+ "with Java ? " +q8.startsWith(java));
        
}
}
