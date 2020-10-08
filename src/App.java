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

        eduardo.depositar(400.0);
        eduardo.saque(700.0);
        System.out.println(eduardo.getSaldo());
    }
}
