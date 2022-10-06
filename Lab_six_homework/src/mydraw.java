import javax.swing.*;
import java.awt.*;

public class mydraw extends JComponent {
    public void paintComponent(Graphics g) {
        int x=120 , y=20 ,wi=60 , he=60 ;

        for (int i = 1; i <= 8; i++) {
            for (int k = 1; k <= 8; k++) {
        Rectangle j = new Rectangle(x, y, wi, he);
        Graphics2D g2 = (Graphics2D) g;
        if ((k%2) == (i%2))
        g2.setColor(Color.white);
         else
        g2.setColor(Color.black);
        g2.fill(j);
                x+=70; y+=0; wi+=0; he+=0;
        }
            x=120; y+=70; wi+=0; he+=0;

    }
    }


}
