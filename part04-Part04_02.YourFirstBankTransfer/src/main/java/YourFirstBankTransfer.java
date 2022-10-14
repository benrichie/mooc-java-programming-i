
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account mattAcc = new Account("Matthews account", 1000);
        Account myAcc = new Account("My account", 0);
        mattAcc.withdrawal(100);
        myAcc.deposit(100);
        System.out.println(mattAcc);
        System.out.println(myAcc);
        
    }
}
