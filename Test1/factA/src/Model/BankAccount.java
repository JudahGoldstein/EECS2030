package Model;

public class BankAccount {
    String name;
    double balance = 0;

    public BankAccount(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final double getBalance() {
        return balance;
    }

    public final void setBalance(double balance) {
        this.balance = balance;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

    public final void deposit(double amount) {
        balance += amount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) { //if it is itself then they are equal
            return true;
        }
        if (!(o instanceof BankAccount)){ //if they are diffrent types they are not equal
            return false;
        }
        return (((BankAccount) o).name == name && balance == balance); //if they have the same name and balance they are equal
    }
}
