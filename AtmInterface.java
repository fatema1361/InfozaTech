import java.util.Scanner;
class BankAccount{
    private double balance;
    BankAccount(double balance){
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit successful!");
        }
        else{
            System.out.println("Invalid deposit amount!");
        }
    }
    public boolean withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid withdrawal amount!");
            return false;
        }
        if(amount>balance){
            System.out.println("Insufficient balance!");
            return false;
        }
        balance-=amount;
        System.out.println("Withdrawal successful!");
        return true;
    }
    public double getBalance(){
        return balance;
    }
}
class ATM{
    private BankAccount account;
    ATM(BankAccount account){
        this.account=account;
    }
    public void withdraw(double amount){
        account.withdraw(amount);
    }
    public void checkBalance(){
        System.out.println("Current Balance: "+account.getBalance());
    }
    public void deposit(double depositAmount) {
       
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }
}
public class AtmInterface {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       BankAccount account=new BankAccount(5000);
       ATM atm=new ATM(account);

       int choice=0;
       do {
            System.out.println("\n===== ATM INTERFACE =====");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            if(!sc.hasNextInt()){
                System.out.println("Invalid input! Enter a number.");
                sc.next();
                continue;  
            }
            choice=sc.nextInt();
            switch(choice){
                 case 1:
                    System.out.print("Enter withdrawal amount: ");

                    if (sc.hasNextDouble()) {
                        double withdrawAmount = sc.nextDouble();
                        atm.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Invalid amount!");
                        sc.next();
                    }
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");

                    if (sc.hasNextDouble()) {
                        double depositAmount = sc.nextDouble();
                        atm.deposit(depositAmount);
                    } else {
                        System.out.println("Invalid amount!");
                        sc.next();
                    }
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank You for using ATM!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        while(choice!=4);
        sc.close();       

    }
}
