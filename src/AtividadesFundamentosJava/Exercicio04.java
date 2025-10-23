package AtividadesFundamentosJava;

public class Exercicio04 {
    public static void main(String[] args) {
        double saldo = 2000;
        int opcao = 2;
        switch(opcao) {
            case 1:
                System.out.printf("Seu saldo é: %.2f", saldo);
                break;
            case 2:
                System.out.println("Qual valor você deseja depositar? ");
                double deposito = 100;
                saldo += deposito;
                System.out.printf("Depósito efetuado com sucesso, seu novo saldo é: R$%.2f", saldo);
                break;
            case 3:
                System.out.println("Qual valor deseja sacar?");
                double saque = 300;
                if (saque <= saldo) {
                    System.out.println("Saque autorizado");
                } else {
                    System.out.println("Saldo insuficiente para sacar");
                }
                break;
            case 4:
                System.out.println("Encerrando...");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
