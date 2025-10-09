// File: AccountDemo.java
public class AccountDemo {
    static class Account {
        private double balance;

        public Account(double balance) {
            this.balance = balance;
        }

        public void deposit(double amount) {
            if(amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            }
        }

        public void withdraw(double amount) {
            if(amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance");
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        Account acc = new Account(1000);
        acc.deposit(500);
        acc.withdraw(300);
        System.out.println("Balance: " + acc.getBalance());
    }
}
