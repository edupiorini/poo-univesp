package accountmanagement;

import apoiosemana.Data;

public class Conta{

    private String nroConta;
    private Double saldo = 200.0;
    private Data dataAbertura;
    private Cliente[] correntistas;

    public void setNroConta(String nroConta) {
        this.nroConta = nroConta;
    }

    public String getNroConta() {
        return nroConta;
    }

    public void setDataAbertura(int dia, int mes, int ano) {
        dataAbertura.setDate(dia, mes, ano);
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    private void setSaldo(Double valor) {
        this.saldo += valor;
    }

    public Double getSaldo() {
        return saldo;
    }

    public boolean depositar(Double montante) {
        if(montante > 0){
        setSaldo(montante);
        System.out.println("Depósito efetuado!");
        return true;
        }else return false;
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

    public Conta(String nroConta, Double saldo, Data dataAbertura, Cliente[] correntistas) {
        this.nroConta = nroConta;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.correntistas = correntistas;
    }



}
