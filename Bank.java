package LAB5;

interface BankInterface {
  void getBalance();
  double getInterestRate();
}
// Bank A class that implements bank interface
class BankA implements BankInterface {
  double balance;
  // Bank A constructor that receives initial balance
  BankA(double balance) {
      this.balance = balance;
  }
  // getBalance from interface ,calculating balance based on interest
  public void getBalance() {
      System.out.println("Bank A interest rate : 7%");
      double final_amount = getInterestRate() + balance;
      System.out.println("Total amount:"+ final_amount);
  }
  // getinterestrate method from interface
  public double getInterestRate() {
      double interest = balance * 0.07;
      return interest;
  }

}
// Bank B class that implements bank interface
class BankB implements BankInterface {
  double balance;
  BankB(double balance) {
      this.balance = balance;
  }
  public void getBalance() {
      System.out.println("Bank B interest rate : 7.4%");
      double final_amount = getInterestRate() + balance;
      System.out.println("Total amount:"+ final_amount);
  }
  public double getInterestRate() {
      double interest = balance * 0.074;
      return interest;
  }
}
// Bank C class that implements bank interface
class BankC implements BankInterface {
  double balance;
  BankC(double balance) {
      this.balance = balance;
  }
  public void getBalance() {
      System.out.println("Bank C interest rate : 7.9%");
      double final_amount = getInterestRate() + balance;
      System.out.println("Total amount:"+ final_amount);
  }
  public double getInterestRate() {
      double interest = balance * 0.079;
      return interest;
  }
}
public class Bank {
  public static void main(String[] args) {
      BankA bankA = new BankA(10000);
      BankB bankB = new BankB(150000);
      BankC bankC = new BankC(200000);
      bankA.getBalance();
      bankB.getBalance();
      bankC.getBalance();
  }

}