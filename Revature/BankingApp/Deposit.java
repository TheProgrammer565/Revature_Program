package BankingApp;
import java.util.Scanner;
class Deposit{
    int amt= 0;
    
    public int userInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited: ");
        amt = scanner.nextInt();
        if(amt<=0)
        {
            InvalidBankTransaction depositError = new InvalidBankTransaction("Invalid Deposit Amount");
            System.out.println(depositError.getMessage());
            userInput();
           
        }else{   
            return amt;
        }

        return amt;
    }

}