public class CommandLineArg
{
    public static void main(String [] args)
    {
        System.out.println("You have entered numbers are");
        for (int i= 0; i<args.length;i++)
        {
            System.out.println(args[i]);
        }
        for(int i=0;i<args.length;i++)
        {
            int number = Integer.parseInt(args[i]);
            if(isPrime(number))
            {
                printTable(number);
            }
            else{
                int ans = number/10;
                System.out.println("The number "+number+ "divded by 10 ans : = " + ans);
            }
        }  
    }


    public static boolean isPrime(int number)
    {
        for(int i = 2; i<Math.sqrt(number);i++)
        {
        if(number%i == 0)
        return false;
        }
        return true;
    }
    public static void printTable(int number)
    {
        System.out.println("The Table of number "+number+" is :");
        for(int i = 1; i<10;i++)
        {
            System.out.println(number+ " * "+i +"  =  "+(number*i) );
        }
    }
   
}