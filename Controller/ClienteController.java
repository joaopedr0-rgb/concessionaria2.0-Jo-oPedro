package Controller;

import java.util.ArrayList;

public class ClienteController {

    public class clientesModel {
        ArrayList<String> listaclientes = new ArrayList<String>();

        public clientesModel(String nome, String email, int idade) {
            if (nome == null || nome.trim().isEmpty() || email == null || email.trim().isEmpty() || idade <= 0) {
                throw new IllegalArgumentException("Todos os campos devem ser preenchidos corretamente.");
            }
            listaclientes.add("Nome: " + nome + ", Email: " + email + ", Idade: " + idade);
        }

        public ArrayList<String> getListaClientes() {
            return listaclientes;
        }
    }
}