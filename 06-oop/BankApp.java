public class BankApp {
    public static void main(String[] args) {
        Account acc = new Account(1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(5000);
        acc.showBalance();
    }
}

class Account {
    private double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
