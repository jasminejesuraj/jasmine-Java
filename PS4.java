import java.util.Scanner;

public class PS4 {
    // Check if a Number is Zero, Positive, or Negative
    // and check if the last digits of two numbers are equal
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n == 0) {
            System.out.println("Zero");
        } else if (n > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n2 % 10 == n3 % 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}