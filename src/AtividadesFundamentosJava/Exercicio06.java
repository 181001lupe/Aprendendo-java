package AtividadesFundamentosJava;

public class Exercicio06 {
    public static void main(String[] args) {
        int[] numeros = new int[]{1, 2, 3, 4, 5};
        int soma = 0;
        for (int numero : numeros) {
            System.out.println(numero);
            soma += numero;
        }
        double media = (double) soma / numeros.length;
        System.out.printf("Soma total: %d, média: %.2f", soma, media);
    }
}
