import java.awt.*;
//Write a program AddTester that prints the expected and actual location, width,
//        and height of box after the call to add.
public class question4 {
    public static void main(String[] args) {
        Rectangle box=new Rectangle(5,10,20,30);
        box.add(0,0);                           /**الباقي من ال x يضاف الى ال width والباقي من الy تضاف الى ال  height*/
                                                           /** حيث وان القيمه المدخله بواسطة ال add  لاتتعدا قيمها المعرفه سابقا */
        System.out.println("Actual location: "+box);
        System.out.println("Expected location: "+new Rectangle(0,0,20,30));




    }
}
