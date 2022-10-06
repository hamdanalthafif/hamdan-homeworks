import javax.swing.*;

public class Counter {
    public static void main(String[] args) {
        TallyCounter  counter = new TallyCounter();
        System.out.println(counter.getValue());
        counter.click();
        counter.click();
        counter.click();
        counter.click();
        counter.click();
        counter.click();
        System.out.println(counter.getValue());
        counter.button();
        counter.button();
        System.out.println(counter.getValue());
        counter.rest();


    }
}
