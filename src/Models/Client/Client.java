package Models.Client;

import Models.Adress.Adress;
import Models.Date.Date;

public class Client {
    private String name, surname, regNumber;
    private Date birthDate;
    private Adress adress;

    public Client(String name, String surname, String cPF, Date birthDate) {
        this.name = name;
        this.surname = surname;
        regNumber = cPF;
        this.birthDate = birthDate;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getSurname() {
      return surname;
    }

    public void setSurname(String surname) {
      this.surname = surname;
    }

    public String getRegNumber() {
      return regNumber;
    }

    public void setRegNumber(String regNumber) {
      this.regNumber = regNumber;
    }

    public Date getBirthDate() {
      return birthDate;
    }

    public void setBirthDate(Date birthDate) {
      this.birthDate = birthDate;
    }

    public Adress getAdress() {
      return adress;
    }

    public void setAdress(Adress adress) {
      this.adress = adress;
    }

   
}
