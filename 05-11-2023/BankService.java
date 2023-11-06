import java.util.Scanner;
public class BankService
{

	static int balance = 1000;
  static int amt = 0;
    public static void deposite()
		{	Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the amount you want to deposite");
		amt = sc.nextInt();
		 balance = balance +amt;
		 System.out.println("Your avaliable balance after deposite is : "+balance);
	}
		public static void withdraw()
		{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to withdraw");
		amt = sc.nextInt();
		if(balance>=0&&amt<=balance)
		{
		 balance = balance - amt;
		 System.out.println("Your avaliable balance after withdraw is : "+balance);
		}
		else
		{
			System.out.println("Your account Balance is low");
		}
		}
		public static void balance()
		{
		System.out.println("Your avaliable balance is : "+balance);
		
	}
}