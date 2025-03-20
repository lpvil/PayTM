import java.util.Scanner;

public class LoadingHome {
    static Scanner scanner = new Scanner(System.in);
    //load main home screen
    public void homeScreenLoading() {
        try {
            System.out.println("PayTM© is loading");
            for (int i = 0; i < 30; i++) {
                System.out.print(".");
                Thread.sleep(300);
            }
            options();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("\n___Welcome to Home Screen___");
    }
    public void options(){
        //this takes the string and iterates to print out a character at a time
        //sets index to 0; check is index is less that the length of prompt char length; adds 1 to index
        //prints out prompt char at index, thread.sleep delays printing by 50 milliseconds
        System.out.println("=========================");
        System.out.println("\n1.Deposit\n" +
                           "2.Withdraw\n3.View Balance\n4.Exit");
        String prompt = "Please choose one of the following options:\n";
        try {
            for (int i= 0; i < prompt.length(); i++){
                System.out.print(prompt.charAt(i));
                Thread.sleep(20);}
        }catch(InterruptedException f) {
            f.printStackTrace();
        }
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                Deposit addMoney = new Deposit();
                addMoney.depositScreen();
                break;
            case 2:
                Withdraw withdrawMoney = new Withdraw();
                withdrawMoney.withdrawScreen();
                break;
            case 3:
                ViewBalance balance = new ViewBalance();
                balance.balanceScreen();
                break;
            case 4: try{System.out.println("Thank you for choosing PayTM©\n" +
                    "see you soon!");
                Thread.sleep(40);
                System.exit(0);
            break;}
            catch(InterruptedException g) {g.printStackTrace();}
            default:
                System.out.println("Error Please enter a valid option!");
                options();
        }
        scanner.close();
    }
}