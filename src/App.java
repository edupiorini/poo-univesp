import Models.Account.Conta;
import Models.Data.Data;

public class App {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.depositar(300.00);

        Conta c2 = c1;
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());


        
        
    }

}
