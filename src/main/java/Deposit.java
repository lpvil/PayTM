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
        this.depositAmount = depositAmount;
        this.response = response;
    }

    //prompt user with deposit screen
    //takes user input
    public void depositScreen() {
        boolean screen = true;
       while(true) {
           System.out.println("---Deposit-Screen---");
           System.out.println("How much would you like to deposit?: ");
           depositAmount = scanner.nextDouble();
           scanner.nextLine();

           System.out.println("You are submitting a deposit amount of $" + depositAmount +
                   "\nConfirm Deposit?(Y/N): ");
           response = scanner.nextLine().toUpperCase();

           if (response.equals("Y")) {
                screen = false;
               deposit();
           }
       }
    }
        //writes deposit to csv file
    public void deposit(){
            File file = new File("C:\\Users\\lpvil\\Desktop\\file.csv");
            try {
                FileWriter fl = new FileWriter(file,true);//true appends instead of overwirting it
                BufferedWriter bf = new BufferedWriter(fl);
                bf.write(("\n"+ depositAmount));

                bf.close();
                fl.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("You have deposited an amount of: " + depositAmount);
            System.out.println("Would you like to make another deposit?(Y/N):");
            String makeAnotherDesposit = scanner.nextLine().toUpperCase();
                if(makeAnotherDesposit.startsWith("Y")){
            depositScreen();
        }
                else{
                   System.out.println("Deposit cancelled\nWould you like to go back?(Y/N): ");
                   String answer = scanner.nextLine().toUpperCase();
                   if(answer.equals("Y")){
                       LoadingHome home = new LoadingHome();
                       home.options();
                   }
                }
        }
    }