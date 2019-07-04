import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

//Common practice for class naming is to use caps for the beginning of each word
public class SignIn {
    //What you see here is my good code

    //Test Accounts
    private static ArrayList<Account> accountList = new ArrayList<Account>();

    public static Scanner input = new Scanner(System.in);

    //Static means that you don't have to instantiate signIn to run the method (i.e. the method is not specific to each object)
    public static void main(String[] args) {
        //Some test accounts
        //I could store these as object variables, but they aren't being used outside of this list so it isn't needed
        accountList.add(new Account("Bob", "1234", 100));
        accountList.add(new Account("Harrison", "1239", -20));
        accountList.add(new Account("Leroy", "Jenkins", 420.01));


        boolean isRunning = false;
    }


    //Again, this is static because there is no reason you should have to instantiate a signIn object to run this method
    public static void login() {
        String response = "";
        Account account;

        System.out.println("Enter a username: ");
        response = input.nextLine();

        //NGL, this part is coded pretty badly, but it isn't thaaaat bad.

        if (findUser(response) == null) {
            System.out.println("Error: User not found.");
            //Generally, putting a return statement in the middle of a method is bad practice because it is hard to debug,
            //but I kind of coded this badly and wouldn't work out well if I did this at the end.
            return;
        }
        account = findUser(response);


        System.out.println("Enter the password: ");
        response = input.nextLine();

        if (response.equals(account.getPassword())){
            System.out.println("Login Successful");
            manage(account);
        }
        else {
            System.out.println("Password is incorrect");
        }
    }

    public static void manage(Account user) {

    }
    /**
     *
     * @param name : the user that you want to find in the local list of accounts
     * @return the account that has that username (null if there isn't any)
     */
    public static Account findUser(String name) {
        Account result = null;

        for (Account user : accountList) {
            //Because a String is an object and not a primitive data type, (int, double, boolean, etc.) you have to use ".equals"
            //instead of "=="
            if (user.getUser().equals(name)) {
                result = user;
            }
        }
        return result;
    }


    /*
    This was your bad code
    public void sign(){

        System.out.println("What is your username?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
            if(name.equals("Bob")){
            System.out.println("What is your password?");
            String pass = s.nextLine();
                if(pass.equals("1234")){
                    Account a = new Account();
                    a.accountAccess();
                    System.out.println("You have " + accountAmount + " dollars");
                    System.out.println("Would like to deposit, withdraw, or leave?");
                    String choice = s.nextLine();
                        if(choice.equals("deposit")){
                            System.out.println("How much would you like to deposit?");
                            String amountD = s.nextLine();
                            Double aD = Double.parseDouble(amountD);
                            newaccountD = aD + accountAmount;
                            accountAmount = newaccountD;
                            System.out.println("You now have added " + amountD + " dollars to your account. You now have " + newaccountD + " dollars");

                        }
                        if(choice.equals("withdraw")){
                            System.out.println("How much would you like to withdraw?");
                            String amountA = s.nextLine();
                            Double aA = Double.parseDouble(amountA);
                                if(accountAmount >= aA){
                                    newaccountA = accountAmount - aA;
                                    accountAmount = newaccountA;
                                    System.out.println("You have taken out " + amountA + " dollars. You now have " + newaccountA + " dollars");
                                }
                                    else{
                                        System.out.println("You do not have enough money.");
                            }
                        }
                        if(choice.equals(("leave"))){

                        }
                }
        }
            else{
                System.out.println("Access Denied");
            }
    }
    */
}