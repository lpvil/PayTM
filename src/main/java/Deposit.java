import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Deposit {
    static Scanner scanner = new Scanner(System.in);
    private double depositAmount;
    private String response;


//constructor allows private values to be accessed outside this class
    public Deposit() {
        this.depositAmount = 0.0;
        this.response = "";
    }

    //prompt user with deposit screen
    //takes user input
    public void depositScreen() {
        boolean continueDeposit = true;
       while(continueDeposit) {
           System.out.println("---Deposit-Screen---");
           System.out.println("How much would you like to deposit?: ");
           depositAmount = scanner.nextDouble();
           scanner.nextLine();

           System.out.println("You are submitting a deposit amount of $" + depositAmount +
                   "\nConfirm Deposit?(Y/N): ");
           response = scanner.nextLine().toUpperCase();

           if (response.equals("Y")) {
                continueDeposit = false;
               deposit();//process deposit
               //ask user if they want to make another deposit
               System.out.println("would you like to make another deposit?: (Y/N)");
               String makeAnotherDeposit = scanner.nextLine().toUpperCase();
               if(makeAnotherDeposit.equals("Y")){
                   continueDeposit = true;
               }
               else{
                 continueDeposit = false;
                 goBackorExit();
               }
           }
       }
    }
        //writes deposit to csv file
    public void deposit(){
            File file = new File("C:\\Users\\lpvil\\Desktop\\file.csv");
            try {
                FileWriter fl = new FileWriter(file,true);//true appends instead of overwirting it
                BufferedWriter bf = new BufferedWriter(fl);
                bf.write(("\n"+ "$" + depositAmount));

                bf.close();
                fl.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("You have deposited an amount of: $" + depositAmount);
        }
        public void goBackorExit(){
            System.out.println("ok Would you like to back to the main menu?: (Y/N)");
            String answer = scanner.nextLine().toUpperCase();
            if(answer.equals("Y")){
            LoadingHome goBack = new LoadingHome();
            goBack.options();
            }
            else{
                System.out.println("thanks for stopping by");
                System.exit(0);//exits program
            }
        }
}