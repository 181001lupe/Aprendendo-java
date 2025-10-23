package AtividadesFundamentosJava;

public class Exercicio03 {
    public static void main(String[] args) {
        double salarioMensal = 2000;
        double salarioAnual = salarioMensal * 12;
        if(salarioAnual <= 34712) {
            double imposto = salarioAnual * 0.097;
            double salarioLiquido = salarioAnual - imposto;
            System.out.printf("Você pagará R$%.2f de imposto e seu salário líquido é de: R$%.2f",imposto, salarioLiquido);
        } else if (salarioAnual > 34712 && salarioAnual <= 68507) {
            double imposto = salarioAnual * 0.3735;
            double salarioLiquido = salarioAnual - imposto;
            System.out.printf("Você pagará R$%.2f de imposto e seu salário líquido é de: R$%.2f",imposto, salarioLiquido);
        } else {
            double imposto = salarioAnual * 0.4950;
            double salarioLiquido = salarioAnual - imposto;
            System.out.printf("Você pagará R$%.2f de imposto e seu salário líquido é de: R$%.2f",imposto, salarioLiquido);
        }
    }
}
