package bankingapplication1;

public interface Account {
public void deposit(double amount);
public void withdraw(double amount);
public double getBalance();
public String getAccountType();
}
   public int getNumber(){
      return this.number;
   }

   public String getName(){
      return this.name;
   }
}
