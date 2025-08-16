public class PS3
{
// Sum of Two Command Line Arguments as Integers
    public static void main(String args[])
    {
        if(args.length == 2)
        {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int sum = n1 + n2;
            System.out.println("Sum of "+n1 +" and "+ n2+" is "+ sum);
        }

        else
        {
            System.out.println("Please provide two integer arguments.");
        }
    }
}