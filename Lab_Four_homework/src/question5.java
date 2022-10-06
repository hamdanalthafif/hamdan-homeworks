public class question5 {
    public static void main(String[] args) {
//
//        The StringBuilder class has a method for reversing a string.
//                In a ReverseTester class, construct a StringBuilder from a given string (such as "desserts"),
//                call the reverse method followed by the toString method, and print the result.
//                Also print the expected value.
//
        StringBuilder b=new StringBuilder("dessertS");
        b.reverse().toString();

        System.out.println("The result is: "+b);
        System.out.println("Expected result is: "+"Stressed");



    }
}
