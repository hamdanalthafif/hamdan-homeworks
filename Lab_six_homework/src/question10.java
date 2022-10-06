/**
 *10. Currency conversion.
 *  Write a program that first asks the user to type today’s price for one dollar in Japanese yen,
 *  then reads U.S. dollar values and converts each to yen. Use 0 as a sentinel
*/
 import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        double yen=0 , PdollarY ,dollar;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the  type today's price for one dollar in yen japanese: ");
        PdollarY=in.nextDouble();

        System.out.println("Enter U.S dollar values: ");
        dollar=in.nextDouble();
        for (int i = 0; i <dollar ; i++) {
            yen+=PdollarY;

            
        }
        System.out.println("Your U.S dollar values equal "+yen+" in Yen japanese");

    }
}
