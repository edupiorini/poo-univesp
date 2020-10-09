package accountmanagement;

public class Cliente {
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
