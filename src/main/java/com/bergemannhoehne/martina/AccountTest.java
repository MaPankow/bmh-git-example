package main.java.com.bergemannhoehne.martina;



public class AccountTest extends MyAccount {
    public static void main(String[] args) {
       
        MyAccount account1 = new MyAccount();
        Account otherAccount = new MyAccount();

        account1.deposit(500);
        account1.withdraw(50);
        System.out.println(account1.getBalance());
        account1.transfer(100, otherAccount);
        

    }

}