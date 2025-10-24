package AtividadesFundamentosJava;

import java.sql.SQLOutput;

public class Exercicio08 {
    public static void main(String[] args) {
        String user = "admin";
        String password = "1234";
        String tentativaUser;
        String tentativaPassword;
        do{
            System.out.println("Digite o usuário: ");
            tentativaUser = "teste";
            System.out.println("Digite a senha: ");
            tentativaPassword = "4321";
            if(!tentativaUser.equals(user) || !tentativaPassword.equals(password)){
                System.out.println("Usuário ou senha errados, tente novamente!");
            }

        } while(!tentativaUser.equals(user) || !tentativaPassword.equals(password));
        System.out.println("Login realizado com sucesso!");
    }
}
