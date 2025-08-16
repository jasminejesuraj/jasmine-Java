public class PS2
{// Welcome Message with Command Line Argument
    public static void main(String args[])
    {
        if(args.length == 1)
        {
            String s1 = args[0];
            if (!s1.isEmpty())
            {
                System.out.println("Welcome "+s1);
            }
            else 
            {
                System.out.println("Please provide a name as an argument.");
            }

        }
        else
        {
            System.out.println("Please provide exactly one argument.");
        }
    }
}