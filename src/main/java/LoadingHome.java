import java.util.Scanner;

public class LoadingHome {
    Scanner scanner = new Scanner(System.in);
    Deposit addMoney = new Deposit();
    Withdraw withdrawMoney = new Withdraw();
    //load main home screen
    public void homeScreenLoading() {
        try {
            System.out.println("PayTM© is loading");
            for (int i = 0; i < 30; i++) {
                System.out.print(".");
                Thread.sleep(300);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("\n___Welcome to Home Screen___");
    }
    public void options(){

        System.out.println("1.Deposit\n" +
                           "2.Withdraw\n3.Exit");
        String prompt = "Please choose one of the following options:\n";
        //this takes the string and iterates to print out a character at a time
        //sets index to 0; check is index is less that the length of prompt char lenght; adds 1 to index
        //prints out prompt char at index, thread.sleep delays printing by 50 milliseconds
        try {
            for (int i= 0; i < prompt.length(); i++){
                System.out.print(prompt.charAt(i));
                Thread.sleep(80);}
        }catch(InterruptedException f) {
            f.printStackTrace();
        }
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                addMoney.depositScreen();
                break;
            case 2:
                withdrawMoney.withdrawScreen();
                break;
            case 3:
            case 4: try{System.out.println("Thank you for choosing PayTM©\n" +
                    "see you soon!");
                Thread.sleep(40);}
            catch(InterruptedException g) {g.printStackTrace();}
                break;
            default:
                System.out.println("Error Please enter a valid option!");
                options();
        }
        scanner.close();
    }
}