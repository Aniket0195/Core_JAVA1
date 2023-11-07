public class CommandLineArg
{
    public static void main(String [] args)
    {
        System.out.println("You have entered numbers are");
        for (int i= 0; i<args.length;i++)//args.legth will take the total argument you have passed and use it for loop iterations.
        {
            System.out.println(args[i]);
        }
        for(int i=0;i<args.length;i++)
        {
            int number = Integer.parseInt(args[i]);//parseInt will convert the agrgument String into the integer
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
        for(int i = 2; i<Math.sqrt(number);i++)// math.sqrt will take squareroot of the number and it will rreduce the no of iterations
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
//to run the java command line argument ==>javac filename.java
//for passing argument ==> java filename argument1 argument2 .......etc
