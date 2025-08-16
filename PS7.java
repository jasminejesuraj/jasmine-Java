public class PS7
{//Print Characters in Ascending Order
    public static void main (String[] args)
    {
        char a='Y';
        char b='b';
        char c=Character.toLowerCase(a);
        char d=Character.toLowerCase(b);
        if (c<=d)
        {
            System.out.println("1");
            System.out.println(a+ "\n"+b);
            
        }
        else{
            System.out.println("2");
            System.out.println(b+"\n"+a);
           
        }
       
    }    
}