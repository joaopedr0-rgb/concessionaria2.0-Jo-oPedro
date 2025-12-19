package view;
import java.util.Scanner;

public class view{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("Bem vindo ao sistema de concessionária!");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Sou funcionario");
        System.out.println("2 - Sou cliente");
        option = sc.nextInt();

        switch(option){
            case 1:
                System.out.println("Área do funcionário selecionada.");
                // Aqui você pode adicionar mais funcionalidades para funcionários
                break;
            case 2:
                System.out.println("Área do cliente selecionada.");
                // Aqui você pode adicionar mais funcionalidades para clientes
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                break;
        }

    }
}