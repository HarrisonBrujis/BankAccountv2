import java.util.Scanner;

//this is how you define a class that doesn't extend anything
public class Account {
    /*
    "Instance" variables go here - variables that are used throughout the class
    They store information that relates to the class
    They are supposed to be made private because it follows common code practices, and prevents code from being misused.
    */
    private String username;
    private String password;
    private double balance;
    /*
    This is called a constructor, and this is the method that is called when you create a class
    For example, you could do: Account user = new Account("Bob");
    It is used to give the instance variables values
    */
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        balance = 0.0;
    }

    //This is called overloading, when there are multiple of the same method, but with different parameters.
    //It makes "new Account("Bob")" and "new Account("Bob", 100) acceptable ways to instantiate an object of type Account
    public Account(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    //called an "Accessor" method
    //Best practice for getting instance variables because you might want to process them first before giving them to the
    public String getUser() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public double getBalance() {
        return balance;
    }

    //These 2 methods are mutator methods (and normally might be called setBalance, addBalance, subBalance, etc.)
    //Mutator methods modify instance variables
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void deposit(double amount) {
        balance += amount;
    }


}

