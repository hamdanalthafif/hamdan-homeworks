import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;
import java.util.Scanner;

/**
 * 8. Prime numbers. Write a program that prompts the user for an integer
 * and then prints out all prime numbers up to that integer.
 * For example, when the user enters 20, the program should print
 * 2 3 5 7 11 13 17 19
 */
public class question8 {
    public static void main(String[] args) {
        int prime; ; int number ;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number: ");
        number=in.nextInt();
        System.out.println("The prime numbers for the inputted number is: ");
        for ( prime = 2; prime <= number; prime++) {
            int j;
            for ( j = 2; j <=prime; j++) {
                if (prime%j==0)
                    break;
            }
            if (j>=prime)
                System.out.println(prime);
        }

    }

}
