package AtividadesFundamentosJava;

public class Exercicio07 {
    public static void main(String[] args) {
        int [] numeros = new int[] {1, 4, 7, 8, 10};
        int maior = numeros[0];
        int menor = numeros[0];
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            } if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("Maior número: "+maior+" | Menor número: "+menor);
    }
}
