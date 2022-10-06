import javax.swing.*;
import java.awt.*;

//Write a graphics program that draws your name in red, contained inside a blue rectangle.
//        Provide a class NameViewer and a class NameComponent.

public class question8 {
    public static void main(String[] args) {
        JFrame x=new JFrame("My_Name" );

        x.setSize(500,500);
        MyDraw d=new MyDraw();
        x.add(d);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setVisible(true);

    }
}
