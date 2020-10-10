package apoiosemana;

/*
Crie uma classe chamada Data que inclua os atributos dia, mês e ano. Além disso, forneça:

    Um construtor que inicializa os três atributos supondo que os valores fornecidos são corretos.
    Os métodos acessadores (get), um para cada atributo.
    Um método modificador (set) que receba o dia, mês e ano e que modifique os valores dos 
        três atributos. Suponha que os valores fornecidos são corretos.
    Um método chamado toString que devolva um string com o dia, mês e ano separados por "/".
    Um método chamado trocarCom que permite fazer a troca de duas datas. Esse método deve 
        receber apenas UMA data como parâmetro, não duas.
*/

public class Data {
    private int day;
    private int month;
    private int year;
    


 public  int getDay(){
     return day;
 }
 public int getMonth(){
     return month;
    
 }
 public int getYear(){
     return year;
 }

 public void setDate(int day, int month, int year){
     this.day = day;
     this.month = month;
     this.year = year;
 }

 public Data(int day, int month, int year) {
     this.day = day;
     this.month = month;
     this.year = year;
 }

 @Override
 public String toString() {
     return "Data [day=" + day + ", month=" + month + ", year=" + year + "]";
 }
    
}
