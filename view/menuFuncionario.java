package view;
import java.util.Scanner;
public class menuFuncionario {
    public static void main(String[] args) {
        int option;
        Scanner scFuncionario = new Scanner(System.in);

        System.out.println("Bem vindo à área do funcionário!");
        System.out.println("Aqui você pode gerenciar as operações da concessionária.");
        // Adicione mais funcionalidades específicas para funcionários aqui
        System.out.println("1 -Faça login para acessar suas funções.");
        System.out.println("2 - Faça o cadastro caso ainda não tenha uma conta.");
        System.out.println("3 - Voltar ao menu principal.");
        option = scFuncionario.nextInt();

        switch(option ){
            case 1:
                System.out.println("Login selecionado.");
                // Adicione funcionalidades de login aqui
                break;
            case 2:
                System.out.println("Cadastro selecionado.");
                // Adicione funcionalidades de cadastro aqui
                break;
            case 3:
                System.out.println("Voltando ao menu principal.");
                // Adicione a lógica para voltar ao menu principal aqui
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                break;
        }
    }

}
