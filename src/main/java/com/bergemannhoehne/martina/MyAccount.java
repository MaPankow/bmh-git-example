package main.java.com.bergemannhoehne.martina;

public class MyAccount implements Account{
    private float balance;

    public MyAccount() {
        this.balance = 0; 
    }
    
    @Override
    public void deposit(float money) {
   
        this.balance = balance + money;
        
    }

    @Override
    public void withdraw(float money) {
        this.balance = balance - money;
    }

    @Override
    public float getBalance() {
       return this.balance;
    }

    @Override
    public void transfer(float money, Account other) {
        this.balance = balance - money;
        other.deposit(money); 
    }
    
}
