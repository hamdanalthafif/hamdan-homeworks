public class TeseterBank_accounter3 {
    public static void main(String[] args) {

        BankAccounter3 a = new BankAccounter3 (0);
        a.deposit( 1000);

        System.out.println(a.getBalance());
        a.withraw(500);
        a.withraw(400);
        System.out.print(a.getBalance() );
        System.out.print("$");

    }



}
