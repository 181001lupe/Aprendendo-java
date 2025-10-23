package AtividadesFundamentosJava;


public class Exercicio01 {
    public static void main(String[] args) {
        int anoNascimento = 1965;
        int anoAtual = 2025;
        int idade = anoAtual - anoNascimento;
        if(idade < 12){
            System.out.println(idade+" anos "+"| categoria: Criança");
        } else if(idade >= 12 && idade < 18)
        {
            System.out.println(idade+" anos "+"| categoria: Criança");
        } else if (idade >= 18 && idade < 60) {
            System.out.println(idade+" anos "+"| categoria: Criança");
        } else {
            System.out.println(idade+" anos "+"| categoria: Criança");
        }
    }
}
