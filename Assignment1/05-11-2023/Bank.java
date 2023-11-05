import java.util.Scanner;
/*
 * Write a program for bank account where money is deposited and the debitade and display balance*/
public class Bank
{ 
    public static void main(String[] args) 
    {
       
      
      int choice;
        
        do 
    {
            System.out.println("1. Deposite the money\n 2.Debit the Money\n3.Display the balance\n0. Exit");
        
                Scanner sc = new Scanner(System.in);
            System.out.println("Enter the choice");
             choice =  sc.nextInt();
        
        switch(choice)
        {
        case 1:
            BankService.deposite();
        break;
        case 2:
            BankService.withdraw();
        break;
        case 3:
            BankService.balance();
        break;
        case 0:
            break;

        }
    }while(choice!=0);
}
}
