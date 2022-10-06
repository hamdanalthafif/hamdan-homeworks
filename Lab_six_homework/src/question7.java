import java.util.Scanner;
/**
 * 7. Write a program that reads a number and prints all of its binary digits:
 * Print the remainder number % 2, then replace the number with number / 2.
 * Keep going until the number is 0. For example, if the user provides the input 13, the output should be 1 1 0 1 .
 */
public class question7 {
    public static void main(String[] args) {
        int  number ,  digit=0  , add=0 ;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number: ");
        number=in.nextInt();

        System.out.println("Number "+number+" in binary is: ");

        for (int i = 0; i <8 ; i++) {        /** *على اي اساس عمل اللوب لكي يقوم بطباعة جميع ال digit عند تحويل الرقم المدخل الى binary بدون زيادة
                                                                                          لان اللوب الان يقوم بتحويل العدد المدخل الى ثمانية بت .*/
            add++;
                digit=number%2;
                number=number/2;

            System.out.println(" "+digit);
        }
        System.out.println("the number is divided "+add+" times");
    }
}
