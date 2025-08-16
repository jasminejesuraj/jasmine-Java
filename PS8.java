public class PS8
{//Check if a Character is an Alphabet, Digit, or Special Character
    public static void main (String[] args)
    {
       char c= '2';
        if(Character.isLetter(c))
        {
            System.out.println("Alphabet");
           
        }
        else if(Character.isDigit(c))
        {
            System.out.println("Digit");
           
        }
        else
        {
            System.out.println("Special Character");
           
        }
    }
}