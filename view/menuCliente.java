package view;
import java.util.Scanner;
import java.util.ArrayList;
import Controller.CarrosController;
import model.carrosModel;
public class menuCliente {
    public static void main(String[] args) {
        CarrosController carrosController = new CarrosController();
        Scanner scCliente = new Scanner(System.in);
        

        System.out.println("Bem vindo à área do cliente!");
        System.out.println("Aqui você pode gerenciar suas compras e informações.");
        System.out.println("1 - Ver catálogo de veículos.");
        System.out.println("2 - Fazer uma compra.");
        int option = scCliente.nextInt();

        switch (option) {
            case 1:
                System.out.println("Catálogo de veículos selecionado.");
                
                for (carrosModel item : carrosController.getListaCarros()) {
                System.out.println(item);
                }
                break;
            case 2:
                System.out.println("Compra selecionada.");
                // Adicione funcionalidades para fazer uma compra aqui
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                break;
        }
    }
}
