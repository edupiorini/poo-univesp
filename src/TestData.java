import apoiosemana.Data;

public class TestData {

    public static void main(String[] args) {
        Data teste1 = new Data(9, 10, 1992);
        Data teste2 = new Data(12, 9, 1990);

        System.out.println("" + teste1.toString() + "\n" + teste2.toString());

        teste1.trocarCom(15);
        teste2.trocarCom(20);

        System.out.println("" + teste1.toString() + "\n" + teste2.toString());
    }
}
