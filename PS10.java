public class PS10
{//Opposite Case
    public static void main(String[] args)
    {
        char c='u';
        if (Character.isUpperCase(c))
        {
            System.out.println(Character.toLowerCase(c));
        }
        else
        {
            System.out.println(Character.toUpperCase(c));
        }
    }
}