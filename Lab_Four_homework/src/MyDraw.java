import javax.swing.*;
import java.awt.*;

public class MyDraw extends JComponent {
    public void paintComponent(Graphics g) {
        Rectangle j = new Rectangle(100, 100, 100, 100);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.blue);
        g2.fill(j);
        g2.getClipBounds(j);


        g2.setColor(Color.red);
        g2.drawString("HAMDAN",125,144);
        g2.setColor(Color.red);
        g2.drawString("MOHAMMED",120,155);
        g2.setColor(Color.red);
        g2.drawString("AHMED",130,166);



    }

}
