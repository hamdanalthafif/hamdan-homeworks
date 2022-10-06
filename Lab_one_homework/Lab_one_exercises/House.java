public class House {


    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {

            if (i == 1)
                System.out.println("   *  ");


            else if (i == 2 ) {
                String n="     ";
                for(int f=0;f<2;f++) {
                    if(f==0)
                    System.out.println(" *   *");
                 if (f == 1)
                        System.out.println("*" + n + "*");

                }
            }
             else if (i == 7) {
                System.out.println("*_____*");
                System.out.println("| .-. |");
                System.out.println("| | | |");
                System.out.println("*-*-*-*");

            }


        }
    }
}