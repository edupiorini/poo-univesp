import poounivesp.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Conta eduardo = new Conta(
        "Eduardo", 
        "Piorini", 
        "123.456.789-10", 
        "02 out 1992", 
        "0001-1", 
        "08 out 2020" 
        );//Conta eduardo

        Conta laura = new Conta(
        "Laura", 
        "Comucci", 
        "012.345.678-91", 
        "15 out 1991", 
        "0001-2", 
        "09 out 2020"
        );//Conta laura

        eduardo.depositar(2000.0);//saldo 2200,00
        eduardo.saque(700.0);//saldo 1500,00
        System.out.println(eduardo.getSaldo());

        System.out.println(laura.getSaldo());
        eduardo.transferePara(laura, 500.0);//saldo laura 700,00  saldo eduardo 1000,00
        System.out.println(laura.getSaldo());
        System.out.println(eduardo.getSaldo());

    }
}
