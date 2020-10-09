package poounivesp;

class Cliente {
    private String nome;
    private String sobrenome;
    private String CPF;
    private String data_nasc;

    public Cliente(String nome, String sobrenome, String cPF, String data_nasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = cPF;
        this.data_nasc = data_nasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

}

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

    public boolean transfere(Conta destino, double montante) {
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
