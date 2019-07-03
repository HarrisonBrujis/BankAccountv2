import java.util.Scanner;

public class signIn extends Main {
    double accountAmount = 100;
    String nameActual;
    String passActual;
    double newaccountD;
    double newaccountA;
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
}