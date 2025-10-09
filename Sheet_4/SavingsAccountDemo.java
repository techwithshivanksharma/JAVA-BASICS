// File: SavingsAccountDemo.java
public class SavingsAccountDemo {
    static class Account {
        private double balance;

        public Account(double balance) {
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public double getBalance() {
            return balance;
        }
    }

    static class SavingsAccount extends Account {
        private double interestRate;

        public SavingsAccount(double balance, double interestRate) {
            super(balance);
            this.interestRate = interestRate;
        }

        public void addInterest() {
            double interest = getBalance() * interestRate / 100;
            deposit(interest);
            System.out.println("Interest added: " + interest);
        }
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1000, 5);
        sa.addInterest();
        System.out.println("Balance after interest: " + sa.getBalance());
    }
}
