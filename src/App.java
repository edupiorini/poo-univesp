import Models.Account.Account;

public class App {
    public static void main(String[] args) {
        Account c1 = new Account();
        c1.deposit(300.00);

        Account c2 = c1;
        System.out.println(c1.getBalance());
        System.out.println(c2.getBalance());


        
        
    }

}
