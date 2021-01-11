package Models.Date;

/*
Crie uma classe chamada Data que inclua os atributos dia, mês e ano. Além disso, forneça:

   ok Um construtor que inicializa os três atributos supondo que os valores fornecidos são corretos.
   ok Os métodos acessadores (get), um para cada atributo.
   ok Um método modificador (set) que receba o dia, mês e ano e que modifique os valores dos 
        três atributos. Suponha que os valores fornecidos são corretos.
   ok Um método chamado toString que devolva um string com o dia, mês e ano separados por "/".
    Um método chamado trocarCom que permite fazer a troca de duas datas. Esse método deve 
        receber apenas UMA data como parâmetro, não duas.
*/

public class Date {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;

    }

    public int getYear() {
        return year;
    }

    public void setDate(int day, int month, int year) {
        // throw exceptions
        if (day <= 0 || day > 31) {
            throw new IllegalArgumentException("Day cannot be negative or greater than 31");
        }
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("Month cannot be negative or greater than 12");
        }
        if (year <= 1900) {
            throw new IllegalArgumentException("Year cannot be negative or this person is dead!");

        } // end of throw exceptions

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date: " + day + " / " + month + " / " + year;
    }

    public void trocarCom(int new_day) {
        int temp = getDay();
        this.day = new_day;
        new_day = temp;
    }
}
