import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/**
 * 9. Write a graphical application that displays a checkerboard with 64 squares,
 * alternating white and black.
 */

public class question9 {
    public static void main(String[] args) {
        int nu=1000,nm=1000;
        Scanner u=new Scanner(System.in) ;
        System.out.print("Input title of the frame: ");
        String r=u.nextLine();
        JFrame x = new JFrame(r);
        x.setSize(nu , nm);

            mydraw d = new mydraw();
            x.add(d);
            x.setVisible(true);






        
    }
}
