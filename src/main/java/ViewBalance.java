import java.util.Scanner;

public class ViewBalance {
    static Scanner scanner = new Scanner(System.in);

    public void balanceScreen() {
        System.out.println("=====================");
        System.out.println("---Balance screen---");
        System.out.println("1.View Balance\n2.Main Menu\n3.Exit");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                LoadingHome mainMenu = new LoadingHome();
                mainMenu.options();
                break;
            case 3:
                System.out.println("Thanks for stopping by");
                System.exit(0);
                break;
            default:
                System.out.println("Error: Not a valid option");
        }


        }
    public void checkBalance(){

    }
}

