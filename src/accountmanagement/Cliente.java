package accountmanagement;

import adresses.Adress;
import apoiosemana.Data;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String CPF;
    private Data data_nasc;
    private Adress endereço;

   

    
    public Cliente(String nome, String sobrenome, String cPF, Data data_nasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        CPF = cPF;
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

    public Data getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Data data_nasc) {
        this.data_nasc = data_nasc;
    }

    public Adress getEndereço() {
        return endereço;
    }

    public void setEndereço(Adress endereço) {
        this.endereço = endereço;
    }
}
