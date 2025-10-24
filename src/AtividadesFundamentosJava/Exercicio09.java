package AtividadesFundamentosJava;

public class Exercicio09 {
    public static void main(String[] args) {
        double [][] matriz = new double[][]{{8, 7}, {9, 9}, {10, 7}};
        double soma = 0;
        double mediaAluno = 0;
        double mediaGeral = 0;
        double mediaGeralResultado;
        int count = 0;
        for(double [] aluno : matriz){
            for(double nota : aluno) {
                soma += nota;
            }
            mediaAluno = soma / 2;
            soma = 0;
            mediaGeral += mediaAluno;
            count++;
            System.out.println("Média "+count+": " +mediaAluno);
        }
        mediaGeralResultado = mediaGeral / matriz.length;
        System.out.printf("Média geral: %.2f", mediaGeralResultado);
    }
}
