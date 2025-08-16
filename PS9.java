public class PS9
{//Interest Percentage based on Gender and Age
    public static void main(String[] args)
    {
        if(args.length ==2)
        {
            int a = Integer.parseInt(args[1]);
            if (args[0].equals("Male") )
            {
                if(a>=1 && a<=58)
                {
                    System.out.println("The Percentage of Interest is 8.4%");
                }
                else if(a>=59 && a<=100)
                {
                    System.out.println("The Percentage of Interest is 10.5%");
                }
            }
            else if (args[0].equals("Female"))
            {
                if(a>=1 && a<=58)
                {
                    System.out.println("The Percentage of Interest is 8.2%");
                }
                else if(a>=59 && a<= 100)
                {
                    System.out.println("The Percentage of Interest is 9.2%");
                }
            }
            
        }
        else
        {
            System.out.println("Enter two command line arguments");
        }
        
    }
}