import accountmanagement.Cliente;
import accountmanagement.Conta;
import apoiosemana.Data;

public class TestConta {
    public static void main(String[] args) throws Exception {
        Data data1 = new Data(02, 10, 2020);
        Cliente eduardo = new Cliente("Eduardo","Piorini", "37779593835", "02 out 1992");
        Cliente[] correntistas = new Cliente[2];
        correntistas[0] = eduardo;
        Conta eduardoconta = new Conta("0001", data1);

        eduardoconta.depositar(2000.0);//saldo 2200,00
        eduardoconta.saque(700.0);//saldo 1500,00
        System.out.println(eduardoconta.getSaldo());

       // System.out.println(laura.getSaldo());
       // eduardoconta.transferePara(laura, 500.0);//saldo laura 700,00  saldo eduardo 1000,00
       // System.out.println(laura.getSaldo());
        System.out.println(eduardoconta.getSaldo());

    }
}
