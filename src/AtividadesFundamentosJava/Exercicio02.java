package AtividadesFundamentosJava;

public class Exercicio02 {
    public static void main(String[] args) {
        double real = 5.0;
        double cotacaoDolar = 5.39;
        double cotacaoEuro = 6.25;
        double dolar = real / cotacaoDolar;
        double euro = real / cotacaoEuro;
        System.out.printf("R$ %.2f reais hoje equivalem a: U$ %.2f dolares e $ %.2f euros", real, dolar, euro);
    }
}
