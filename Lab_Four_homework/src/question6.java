import java.util.Random;
import java.util.random.RandomGenerator;

//Write a program DieSimulator that uses
//        the Random class to simulate the cast of a die,
//        printing a random number between 1 and 6
//        every time that the program is run

public class question6 {
    public static void main(String[] args) {

        Random z=new Random();
      int k= z.nextInt(6);
        System.out.println(k);

    }
}
