import java.util.Scanner;

/**
 * Write a program that reads a word and prints each character of the word on a separate line.
 * For example, if the user provides the input "Harry", the program prints
 * H
 * A
 * R
 * R
 * Y
 */
public class question3 {
    public static void main(String[] args) {
        String word;   char add=32;
        Scanner in=new Scanner(System.in);
        System.out.println("Input your word: ");
        word=in.nextLine();
        for (int i = 0; i <word.length() ; i++) {
            if (word.charAt(i)>=97 ) {
                add=add++;                      /** add is converting the letters from small to capital */
                char ca= (char) (word.charAt(i)-add);        //great
                System.out.println("  " + ca);
            }
            else
                System.out.println("  "+word.charAt(i));

        }
    }
}
