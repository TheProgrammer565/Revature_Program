package BankingApp;
import java.util.Scanner;
class Menu{
    int selectedOption;

    Withdraw banking = new Withdraw();

    public void showMenu()
    {
        System.out.println("Please Select an option below:");
        System.out.println("Enter 1 to Deposit Amount.");
        System.out.println("Enter 2 to Withdraw Amount.");
        System.out.println("Enter 3 to View Balance");
        System.out.println("Enter any key to Exit");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter the option to proceed");
        selectedOption = scanner.nextInt();


        switch (selectedOption) {
            case 1:
                 Deposit d = new Deposit();
                 int depamt =  d.userInput();

                 banking.add(depamt);

                 showMenu();

                break;
            case 2:
                 System.out.println("Please Enter the amount to withdraw:");
                 int withamt=scanner.nextInt();
                 banking.withdrw(withamt);
                 showMenu();
                break;
            case 3:
                  System.out.println("Your Account Balance is "+banking.getBalance()+" Rupees");
                  System.out.println(" ");  
                  showMenu();
                break;
        
            default:
                  System.out.println("Transaction Ended");
                  System.exit(0);
                break;
        }
       scanner.close(); 
    }

}