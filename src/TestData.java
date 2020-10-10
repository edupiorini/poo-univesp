import apoiosemana.Data;

public class TestData {
    
    public static void main(String[] args) {
        Data teste1 = new Data(9,10, 1992);
        //teste1.toString();
        System.out.println(teste1.toString());
        teste1.trocarCom(15);
        System.out.println(teste1.toString());
    }
}
