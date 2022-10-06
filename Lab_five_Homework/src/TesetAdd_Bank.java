public class TesetAdd_Bank {
    public static void main(String[] args) {

        Add_Bank momsSaving = new Add_Bank(1000);
        momsSaving.deposit(5000);
        momsSaving.withraw(1000);

        momsSaving.addlnteresr(0.01);

        System.out.println( momsSaving.getBalance());
      momsSaving.withraw(5000);
    momsSaving.withraw(1000);

        System.out.println(momsSaving.getBalance() );
    }
}
