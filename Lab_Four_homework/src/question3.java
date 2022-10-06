public class question3 {
    public static void main(String[] args) {
        String z=new String("Mississippi");
        String  n=z.replace("i","!");
        System.out.println("actual answer: M!ss!ss!pp!");
        System.out.println("Expected answer: "+n);
        System.out.println("The length of the first resulting string: "+n.length());

        String b=n.replace("s","$");
        System.out.println("actual answer: M!$$!$$!pp!");
        System.out.println("Expected answer: "+b);
        System.out.println("The two length of the second resulting string: "+b.length());

    }
}
