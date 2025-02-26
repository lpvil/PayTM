import java.util.Scanner;

public class Deposit {
    Scanner scanner = new Scanner(System.in);
    float depositAmount;
    String response;

    //prompt user with deposit screen
    //takes user input
    public void depositScreen() {
        System.out.println("---Deposit-Screen---");
        System.out.println("\n\nHow much would you like to deposit?: ");
        float depositAmount = scanner.nextFloat();
        scanner.nextLine();
        do {
            System.out.println("You are submitting a deposit amount of $" + depositAmount +
                    "\nConfirm Deposit?(Y/N): ");
            String response = scanner.nextLine().toUpperCase();}
            while (!response.equals("Y")) ;

            //will write deposit to csv file
          //  public void deposit(){

            }
    }