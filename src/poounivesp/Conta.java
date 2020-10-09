package poounivesp;

public class Conta extends Cliente {

    private String nroConta;
    private String dataAbertura;
    private Double saldo = 200.0;

    public void setNroConta(String nroConta) {
        this.nroConta = nroConta;
    }

    public String getNroConta() {
        return nroConta;
    }

    public void setDataAbertura(String data) {
        this.dataAbertura = data;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    private void setSaldo(Double valor) {
        this.saldo += valor;
    }

    public Double getSaldo() {
        return saldo;
    }

    public boolean depositar(Double montante) {
        setSaldo(montante);
        System.out.println("Depósito efetuado!");
        return true;
    }

    public boolean saque(Double montante) {
        if (montante <= getSaldo()) {
            setSaldo((montante * (-1)));
            System.out.println("Saque concluído!");
            return true;
        } else {
            System.out.println("Saldo insuficiente! Abortando...");
            return false;
        }
    }

    public boolean transferePara(Conta destino, double montante) {
        if (getSaldo() >= montante) {
            setSaldo((montante * (-1.0)));

            destino.setSaldo(montante);
            System.out.println("Transferência concluída!");
            return true;
        } else {
            System.out.println("Transferência não realizada!");
            return false;
        }
    }

    public Conta(String nome, String sobrenome, String cPF, String data_nasc, String nroConta, String dataAbertura) {
        super(nome, sobrenome, cPF, data_nasc);
        this.nroConta = nroConta;
        this.dataAbertura = dataAbertura;
    }

}
