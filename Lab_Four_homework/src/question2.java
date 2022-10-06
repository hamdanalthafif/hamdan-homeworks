public class question2 {
    public static void main(String[] args) {

        String z=new String("Mississippi");
        String  n=z.replace("i","ii");
        System.out.println("After first modification: "+n);
        System.out.println("The length of the first resulting string: "+n.length());

        String b=n.replace("ss","s");

        System.out.println("After second modification: "+b);
        System.out.println("The two length of the second resulting string: "+b.length());


    }
}
