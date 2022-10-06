import com.sun.source.doctree.SeeTree;

import java.util.Scanner;

/**
 * 4. Write a program that reads a word and prints the word in reverse.
 * For example, if the user provides the input "Harry", the program prints yrraH
 */

public class question4 {
    public static void main(String[] args) {
        String word ;     int  reverse;
        Scanner in=new Scanner(System.in);
        System.out.println("Input your word: ");
        word=in.next();
        reverse=word.length();

        for (int i = 1; i < word.length() ; i--) {
            reverse--;
            System.out.print(word.charAt(reverse));
        }

    }
}
