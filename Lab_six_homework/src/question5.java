import java.util.Scanner;
/**
 * Write a program that reads a word and prints the number of vowels in the word. For this exercise,
 * assume that a e i o u y are vowels. For example, if the user provides the input "Harry", the program prints 2 vowels.
 */
public class question5 {
    public static void main(String[] args) {
        int vowels=0; String word; int l;

        Scanner in=new Scanner(System.in);
        System.out.println(" Input any word: ");
        word=in.nextLine();
        System.out.print("The vowels in your writing are: ");
        for (int i = 0; i < word.length(); i++) {
            char a=word.charAt(i);

            if ( a== 'a' ||a=='e'||a=='i'||a=='o'||a=='u'||a=='y') {
                vowels++;
                System.out.print(word.charAt(i)+" ");
            }
            }
        System.out.println(" ");
        System.out.println("Your writing has: "+vowels+" vowels ");
        }

    }

