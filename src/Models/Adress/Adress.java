package Models.Adress;

public class Adress {
    private String rua, cidade, estado, país, cep;
    private int houseNumber;

    public Adress(String rua, int houseNumber, String cidade, String estado, String país, String cep) {
        //throw exceptions
        if (houseNumber <= 0) {
            throw new IllegalArgumentException("Invalid house number");
            
        }

        this.rua = rua;
        this.houseNumber = houseNumber;
        this.cidade = cidade;
        this.estado = estado;
        this.país = país;
        this.cep = cep;
    }

    public void setHouseNumber(int houseNumber){
        this.houseNumber = houseNumber;
    }
    public int getHouseNumber() {
        return houseNumber;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
