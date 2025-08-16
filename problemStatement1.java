public class problemStatement1

{//Command Line Arguments
    public static void main(String args[])
    {
        if(args.length == 2)
        {
            String s1 = args[0];
            String s2 = args[1];
            if (s1.equals("Company") && s2.equals("Bangalore"))
            {
                System.out.println("Wipro Technologies Bangalore");

            }
            else if  (s1.equals("ABC") && s2.equals("Mumbai"))
            {
                System.out.println("ABC Technologies Mumbai");

            }

        }
    }
}